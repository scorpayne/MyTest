/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.async;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class AsyncHandler {
    //控制资源释放
    private CountDownLatch latch;
    
    private volatile boolean handleFinish;
    
    /**
     * 消息写入本地文件完成.
     */
    private volatile boolean sendFinish;

    /**
     * 阻塞队列.
     */
    private BlockingQueue<String> queue;

    private BufferedWriter bw;

    public AsyncHandler(CountDownLatch latch) {
        this.latch = latch;
        /**
         * 使用链表实现.
         */
        queue = new LinkedBlockingQueue<>();
        File file = new File("E:/hello.txt");
//        if(!file.exists()){
//            file.createNewFile();
//        }
        try {
            
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"utf-8"));
//            bw = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handle() {
        // 模拟性能瓶颈的执行过程,3s处理一条消息.
        new Thread() {
            public void run() {
                while (!handleFinish) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e1) {
                        // 不做处理.
                    }
                    String s = queue.peek();
                    if (s != null) {
                        queue.poll();
                        try {
                            bw.write(s);
                            bw.newLine();
                        } catch (IOException e) {
                        }
                    }
                    // 若队列为空并且消息发送完成.
                    if (queue.isEmpty() && sendFinish) {
                        // 计数器1->0
                        latch.countDown();
                        // 让处理过程结束.
                        handleFinish = true;
                        break;
                    }
                }
            }

        }.start();
    }
    
    /**
     * 
     * <pre>
     * 给出消息发送完成的标识.
     * </pre>
     *
     */
    public void sendFinish() {
        sendFinish = true;
    }

    /**
     * 
     * <pre>
     * 资源释放.
     * </pre>
     *
     */
    public void release() {
        System.out.println("release!");
        if (bw != null) {
            try {
                bw.close();
            } catch (IOException e) {
                // TODO 打印日志.
            }
        }
        //其实使用queue = null就够了.
        if (queue != null) {
            queue.clear();
            queue = null;
        }
    }

    /**
     * 
     * <pre>
     * 往队列发送消息.
     * </pre>
     *
     * @param text
     */
    public void sendMsg(String text) {
        if (text != null && !text.isEmpty()) {
            queue.add(text);
        }
    }
    
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(1);
        AsyncHandler handler = new AsyncHandler(latch);
        handler.handle();

        // 做一次检查.
        Scanner scanner = new Scanner(System.in,"UTF-8");
        while (true) {
            String text = "";
            try {
                text = new String(scanner.next().getBytes("utf-8"),"UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(AsyncHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            // 若用户选择退出.
            if ("exit".equals(text)) {
                // 表示消息已经发送完成.
                handler.sendFinish();
                break;
            }
            handler.sendMsg(text);
        }

        try {
            // 阻塞主线程等待消息写入到本地文件完成.
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 释放资源 文件流,队列.
        handler.release();
        // 关闭控制台输入.
        scanner.close();
    }
}
