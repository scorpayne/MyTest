/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.reflection;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class Student {
    private String name;
    
    private int age = 10;
    
    private BigDecimal pocketMoney = BigDecimal.ONE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(BigDecimal pocketMoney) {
        this.pocketMoney = pocketMoney;
    }
    
    
}
