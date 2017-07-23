/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.args;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Administrator
 */
public class VarArgs {
    /**
     * 打印消息，消息数量可以任意多
     * @param debug 是否debug模式
     * @param msgs  待打印的消息
     */
    public static void printMsg(boolean debug, String ... msgs){
        if (debug){
            // 打印消息的长度
            System.out.println("DEBUG: 待打印消息的个数为" + msgs.length);
        }
        for (String s : msgs){
            System.out.println(s);
        }
        if (debug){
            // 打印消息的长度
            System.out.println("DEBUG: 打印消息结束");
        }
    }
    /**
     * 重载printMsg方法，将第一个参数类型该为int
     * @param debugMode 是否debug模式
     * @param msgs  待打印的消息
     */
    public static void printMsg(int debugMode, String ... msgs){
        if (debugMode != 0){
            // 打印消息的长度
            System.out.println("DEBUG: 待打印消息的个数为" + msgs.length);
        }
        for (String s : msgs){
            System.out.println(s);
        }
        if (debugMode != 0){
            // 打印消息的长度
            System.out.println("DEBUG: 打印消息结束");
        }
    }
     
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(VarArgs.class.getName());
//        PropertyConfigurator.configure("log4j.properties");
        // 调用printMsg(boolean debug, String ... msgs)方法
//        VarArgs.printMsg(true);
//        VarArgs.printMsg(false, "第一条消息", "这是第二条");
//        VarArgs.printMsg(true, "第一条", "第二条", "这是第三条");
//         
//        // 调用printMsg(int debugMode, String ... msgs)方法
//        VarArgs.printMsg(1, "The first message", "The second message");
//        Student s = new Student();
//        try {
//            s.say("122");
//        } catch (BusinessException ex) {
//            Logger.getLogger(VarArgs.class.getName()).log(Level.SEVERE, "会输出什么？", ex);
//        }
//        try{
//            logger.warn("哈哈");
            logger.debug("222");
            logger.info("111");
//        }catch(Exception ex){
//            logger.info(ex.getMessage());
//        }
        
        
    }

}
