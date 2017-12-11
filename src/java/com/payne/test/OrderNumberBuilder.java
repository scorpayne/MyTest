/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class OrderNumberBuilder {

    //在类加载时便实例化了
    private static OrderNumberBuilder instance = new OrderNumberBuilder();

    private OrderNumberBuilder() {

    }

    public static OrderNumberBuilder getInstance() {
        return instance;
    }

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");
//        String format = df.format(new Date());
//        System.out.println(format);

//        double num = 12343171.6; 
//        double perNum = 0.23; 
//        //获取常规数值格式  
//        NumberFormat number = NumberFormat.getIntegerInstance(); 
//        String str = number.format(num);//12,343,171.6 
//        System.out.println(str);   //输出12,343,172
//
//        //获取整数数值格式 
//        NumberFormat integer = NumberFormat.getIntegerInstance(); 
//        String inStr = integer.format(num);//如果带小数会四舍五入到整数12,343,172 
//        System.out.println(inStr);
//        
//        //获取显示百分比的格式
//        NumberFormat percent = NumberFormat.getCurrencyInstance();
//        percent.setMinimumFractionDigits(2);
//        percent.setMaximumFractionDigits(3);
//        String perStr = percent.format(perNum);
//        System.out.println(perNum);  
//        
//        BigDecimal chengshu = new BigDecimal("35");
//        BigDecimal beichengshu = new BigDecimal("0.7");
//
//        BigDecimal chushu = new BigDecimal("3.6");
//        BigDecimal beichushu = new BigDecimal("0.7");
//        //除法 
//        BigDecimal chefaResult = chengshu.multiply(beichengshu).setScale(0,BigDecimal.ROUND_HALF_UP);
//        BigDecimal chufaResult = chushu.divide(beichushu,0,BigDecimal.ROUND_HALF_UP);
//        System.out.println(chefaResult.toString());
//        System.out.println(chufaResult.toString());
//        System.out.println(beichengshu.toString());  //如果浮点型的构造成BigDecimal，精度会丢失，会报错。最好用string构造
//        
//        String format = String.format("%.2f",0.3546546);
//        System.out.println(format); 
//          BigDecimal amount = new BigDecimal("-120.00");
//          BigDecimal amount2 = new BigDecimal("0.5");
//          BigDecimal amount3 = BigDecimal.ZERO;
//          
//          amount = amount.multiply(amount2);
//          System.out.println(amount); 
//          System.out.println(amount3);  
//          System.out.println(amount.signum());//正负  
//          System.out.println(amount.scale()); //标度
//          System.out.println(amount.stripTrailingZeros().scale());//去零后的标度
//          amount = amount.stripTrailingZeros();
//          System.out.println(amount.signum());//正负 
//          System.out.println(amount.scale());
//          System.out.println(amount);
//        int count=0; 
//        final int maxNum = 10;
//        int i; //数组的下标
//        Random r = new Random();
//        StringBuilder b = new StringBuilder();
//        char[] c ={'0','1','2','3','4','5','6','7','8','9'};
//
//        while(count<6){ //生成几位数                                                                      
//            i = Math.abs(r.nextInt(maxNum));//随机生成数组的下标
//            
//            if(i>=0 && i<c.length){
//                b.append(c[i]);
//                count++;
//            }
//        }
//        String randomNum = b.toString();
//        
//        System.out.println(randomNum);
        int count = 0;
        int i;
        final int maxNumber = 10;
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random r = new Random();
        StringBuilder b = new StringBuilder();

        while (count < 6) {
            i = Math.abs(r.nextInt(maxNumber));

            if (i >= 0 && i < c.length) {
                b.append(c[i]);
                count++;
            }
        }
        System.out.println("随机数：" + b.toString());

//        System.out.println(format+randomNum);
//         SimpleDateFormat sdf = new SimpleDateFormat("");
//         Date a = new Date(1450889539);
//         System.out.println(sdf.format(a));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(Long.valueOf(1450889539+"000"));
//        System.out.println(date);
//        System.out.println(sdf.format(date));
//        Date parseDate = DateUtils.parseDate("2015-12-19", new String[]{"yyyy-MM-dd HH:mm:ss"});
//          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//          Date parse = sdf.parse("2015-12-23 14:25:00");
//          System.out.println(parse);
//        double b= 1;
//        b=b+1;
//        System.out.println(b);
//        for(char a='A';a<='Z';a++){
//        }
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a", Locale.US);
////        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
//        Date parse = sdf.parse("1/5/2013 1:57 PM");
//        System.out.println(df.format(parse));
//        System.out.println(df.format("2013-01-05 15:22 PM"));
//        System.out.println(parse);
//        Calendar c = Calendar.getInstance();
//        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
//        Date currentTime = new Date();
//        Calendar c = Calendar.getInstance();
//        int year = c.get(Calendar.YEAR);
//        String front = "12月31日 16:40";
//        String dateStr = year+"年"+front;
//        System.out.println(df.parse(dateStr));
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.YEAR, 1);
//        String dateString = df.format(currentTime); 
//        Date currentYear = df.parse(dateString);
//        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
//        c.setTime(currentYear);
//        c.add(Calendar.YEAR, 1);
////        Date a = new Date(dateString+);
//        System.out.println(c.getTime());
//        System.out.println(a.getYear());
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        NumberFormat format = NumberFormat.getPercentInstance();// 获取格式化类实例
//        format.setMinimumFractionDigits(2);// 设置小数位
//        System.out.println(format.format(17.2 / 100.0));// 打印计算结果
        
        BigDecimal chengshu = new BigDecimal("1000000000000000000000000000000");
        System.out.println(chengshu.toString());
    }

}
