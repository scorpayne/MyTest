/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.async;

/**
 *
 * @author Administrator
 */
/** 
 * 简单本地发送异步消息的类 
 * @author KOOK 
 * 
 */  
public class LocalSend implements CallBack,Runnable{
    /** 
     * 远程接收消息的类，模拟point-to-point 
     */  
    private RemoteAccept remote;  
    
    /** 
     * 发送出去的消息 
     */  
    private String message; 

    public LocalSend(RemoteAccept remote, String message) {
        this.remote = remote;
        this.message = message;
    }
    
    public void sendMessage(){
        /**当前线程的名称**/  
        System.out.println(Thread.currentThread().getName());  
        /**创建一个新的线程发送消息**/  
        Thread thread = new Thread(this);  
        thread.start();  
        /**当前线程继续执行**/  
        System.out.println("Message has been sent by Local~!");  
    }
    
    @Override
    /** 
     * 发送消息后的回调函数 
     */ 
    public void execute(Object... objects) {
        /**打印返回的消息**/  
        System.out.println(objects[0]);  
        /**打印发送消息的线程名称**/  
        System.out.println(Thread.currentThread().getName());  
        /**中断发送消息的线程**/  
        Thread.interrupted();  
    }

    @Override
    public void run() {
        remote.executeMessage(message, this);  
    }
    
    public static void main(String[] args){
        LocalSend localSend =  new LocalSend(new RemoteAccept(), "Hello");
        localSend.sendMessage();
    }
}
