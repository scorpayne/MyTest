/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class StringTest {

    public static void main(String[] args) {
//        String a = "160504185452148809-1";
//        a = a.split("-")[0];
//        System.out.println(a);
        Random r = new Random();
        long a = 0l;
        for(int i=0;i<10000;i++){
            a = r.nextInt(5001) + 5000;
            if(a==5000){
                System.out.println(a);
            }
        }
    }
}
