/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.async;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class RemoteAccept {
    /** 
     * 处理消息 
     * @param msg   接收的消息 
     * @param callBack  回调函数处理类 
     */  
    public void executeMessage(String msg,CallBack callBack)  
    {  
        try {
            /**模拟远程类正在处理其他事情，可能需要花费许多时间**/
//        for(int i=0;i<1000000000;i++)
//        {
//
//        }
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RemoteAccept.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**处理完其他事情，现在来处理消息**/  
        System.out.println(msg);  
        System.out.println("I hava executed the message by Local");  
        /**执行回调**/  
        callBack.execute(new String[]{"Nice to meet you~!"});  
    }  
      
}
