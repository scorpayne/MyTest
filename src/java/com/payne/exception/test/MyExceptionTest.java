/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.exception.test;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class MyExceptionTest {
    public static void main(String[] args){
        Student s = new Student();
        System.out.println("please input the number:");
        Scanner scanner = new Scanner(System.in);
        try {
            s.speak(scanner.nextInt());
        } catch (MyException ex) {
            System.out.println(ex.toString());
            Logger.getLogger(MyExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
