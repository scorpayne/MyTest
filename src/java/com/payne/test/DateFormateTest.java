/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author peng.dengp
 */
public class DateFormateTest {
    public static void main(String[] args) throws ParseException{
//        String a = null;
//        boolean ismmediated = a == null || DateUtils.parseDate(null,"yyyy-MM-dd HH:mm").compareTo(new Date()) <= 0;
//        
//        System.out.println("结果是："+ismmediated);
//        System.out.println("结果是："+System.currentTimeMillis());
//            
//              String randomNum = String.valueOf(Math.random());
//        randomNum = randomNum.replace(".", "");
//        randomNum = randomNum.substring(0, 8);
//        
//        System.out.println("结果是："+Integer.valueOf(randomNum.toString()));
//        
//        Integer a = 1000000000;
        
//        BigDecimal b = new BigDecimal("3000000000");
//        System.out.println("结果是："+b.longValue());
//        System.out.println("结果是："+b.intValue());
        
        SimpleDateFormat sdf = new SimpleDateFormat("");
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.set(Calendar.MINUTE, 0);
//        c.set(Calendar.SECOND, 0);
//        c.set(Calendar.MILLISECOND, 0);
//        
        
        System.out.println(sdf.format(new Date()));
        
    }
}
