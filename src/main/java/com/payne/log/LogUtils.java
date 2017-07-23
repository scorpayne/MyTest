/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class LogUtils {
    public static String defaultTimeFormatString = "yyyy-MM-dd'T'HH:mm:ssXXX";
    
    public static String hostAddress = "http://vhost";

    public static String getDefaultTimeFormatString() {
        return defaultTimeFormatString;
    }

    public static void setDefaultTimeFormatString(String defaultTimeFormatString) {
        LogUtils.defaultTimeFormatString = defaultTimeFormatString;
    }

    public  String getHostAddress() {
        return hostAddress;
    }

    public  void setHostAddress(String hostAddress) {
        LogUtils.hostAddress = hostAddress;
    }
    
    public static String getDefaultTimestampDisplay() {
        return getDefaultTimestampDisplay(new Date());
    }
    
    public static String getDefaultTimestampDisplay(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(LogUtils.defaultTimeFormatString).format(date);
    }
    
    public static void log(Object obj){
        if (obj instanceof Throwable) {
            System.err.println("[ERROR]" + "[" + LogUtils.getDefaultTimestampDisplay() + "]" + "[" + hostAddress + "] " + obj.toString());
        } else {
            System.out.println("[INFO]" + "[" + LogUtils.getDefaultTimestampDisplay() + "]" + "[" + hostAddress + "] " + obj.toString());
        }
    }
}
