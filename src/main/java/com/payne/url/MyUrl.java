package com.payne.url;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Clock;

/**
 * Created by dengpeng on 2017/6/20.
 */
public class MyUrl {
    public static void main(String[] args){
        URL url;
        try {
            url = new URL("http://baidu.com");

            System.out.println("Protocol: " + url.getProtocol()); // 协议
            System.out.println("Port: " + url.getPort()); // 端口
            System.out.println("Host: " + url.getHost()); // 主机
            System.out.println("File: " + url.getFile()); // url对应的文件名
            System.out.println("Ext:" + url.toExternalForm());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
