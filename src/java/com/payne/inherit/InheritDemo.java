/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.inherit;

/**
 *
 * @author peng.dengp
 */
public class InheritDemo {
    
    public static void main(String[] args){
        Apple a = new Apple();
        a.setName("apple");
        String name = Foo.getName(a);
        System.out.println(name);
        
    }
}
