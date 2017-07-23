/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.help;

/**
 *
 * @author Administrator
 */
public class AskHelpTest {
    public static void main(String[] args){
        Asker a = new Asker();
//        a.setHi(new HelperZhangsan());
        a.setHi(new HelperInterface() {
            @Override
            public void rescue() {
                System.out.println("路见不平拔刀相助！");
            }
        });
        a.sos(); //调用求救方法
    }
}
