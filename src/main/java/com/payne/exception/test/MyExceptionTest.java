/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.exception.test;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class MyExceptionTest {

    public static void main(String[] args) {
        Student s = new Student();
//        System.out.println("please input the number:");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            s.speak(scanner.nextInt());
//        } catch (MyException ex) {
//            System.out.println(ex.toString());
//            Logger.getLogger(MyExceptionTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
        int errorCount = 0;
        for (int i = 0; i < 5; i++) {
            try{
                s.say(new Random().nextInt(6));
            }catch(Exception ex){
                errorCount++;
            }
        }
        if(errorCount==0){
            System.out.println("恭喜没踩到地雷");
        }else{
            System.out.println("报错了,出错了："+errorCount+"次");
        }
        
    }
}
