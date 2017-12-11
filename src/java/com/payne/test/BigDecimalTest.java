/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.test;

import java.math.BigDecimal;

/**
 *
 * @author peng.dengp
 */
public class BigDecimalTest {
    public static void main(String[] args){
                BigDecimal chengshu = new BigDecimal("35");
        BigDecimal beichengshu = new BigDecimal("0.7");

        BigDecimal chushu = new BigDecimal("365");
        BigDecimal beichushu = new BigDecimal("100");
        
            BigDecimal chefaResult = chengshu.multiply(beichengshu).setScale(0,BigDecimal.ROUND_HALF_UP);
    BigDecimal chufaResult = chushu.divide(beichushu,0,BigDecimal.ROUND_HALF_UP);
    System.out.println(chefaResult.toString());
    System.out.println(chufaResult.toString());
    }
}
