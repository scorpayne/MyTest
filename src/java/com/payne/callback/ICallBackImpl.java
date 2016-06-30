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
public class ICallBackImpl implements ICallBack{

    @Override
    public void executeCallBack() {
        System.out.println("执行回调方法...");
    }
    
}
