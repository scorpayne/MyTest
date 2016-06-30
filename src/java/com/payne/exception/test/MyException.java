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
public class MyException extends Exception{
    String message;
    
    public MyException(int m){
        message = "the number " + m + " great than 1000";
    }
    
    public String toString(){
        return message;
    }
}
