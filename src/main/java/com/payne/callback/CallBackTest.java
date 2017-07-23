/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.callback;

/**
 *
 * @author Administrator
 */
public class CallBackTest {
    public static void main(String[] args){
        Caller c = new Caller();
        ICallBackImpl icbi = new ICallBackImpl(); //实现约定的接口，回调的时候执行的就是自己的实现
        c.setCallBack(icbi); //注册调用类，就能实现回调了
        c.doSth();
    }
}
