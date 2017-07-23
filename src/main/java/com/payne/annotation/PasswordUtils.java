/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.annotation;

/**
 *
 * @author Administrator
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword() {
        return true;
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return password;
    }

    @UseCase(id = 49, description = "Jong_Cai")
    public void showName() {
        System.out.println("Jong_Cai");
    }
}
