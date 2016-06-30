/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DataTypeConversion {
    public static void main(String[] args) {
//        Date a  = new Date(Long.valueOf(0+"000"));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(a));
//        System.out.println(System.currentTimeMillis()/1000);
        
//        sdf.format(new Date(System.currentTimeMillis()/1000));
//        System.out.println(sdf.format(new Date(System.currentTimeMillis())));
//        System.out.println(System.currentTimeMillis());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String data = sdf.format(new Date());
        try {
            Date a = sdf.parse(data);
            System.out.println(a.toString());
        } catch (ParseException ex) {
            Logger.getLogger(DataTypeConversion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.add(Calendar.DATE,2);
//        String format = sdf.format(c.getTime());
//        try {
//            c.setTime(sdf.parse(format));
//            c.setTimeInMillis(c.getTimeInMillis()-1000);
//            System.out.println(c.getTime());
//        } catch (ParseException ex) {
//            Logger.getLogger(DataTypeConversion.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
}
