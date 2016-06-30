/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.exception.test;

/**
 *
 * @author Administrator
 */
public class Student {

    public void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException(m);
        } else {
            System.out.println("the number is:" + m);
        }
    }
}
