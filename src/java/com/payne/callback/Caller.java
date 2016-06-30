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
public class Caller {
    private ICallBack icb;
    
    public void setCallBack(ICallBack icb){
        this.icb = icb;
    }
    
    public void doSth(){
        this.icb.executeCallBack();
    }
}
