/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

/**
 *
 * @author Administrator
 */
public class BusinessTest {
    public static void main(String[]args){
        Parent p = new Parent(new Student(50));
        System.out.println(p.translate("我爱你").toString());
        
    }
}
