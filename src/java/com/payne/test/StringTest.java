/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import com.payne.model.Parent;
import com.payne.model.Student;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Administrator
 */
public class StringTest {

    public static void main(String[] args) throws IOException {
//        String a = "160504185452148809-1";
//        a = a.split("-")[0];
//        System.out.println(a);
//        Random r = new Random();
//        long a = 0l;
//        for(int i=0;i<10000;i++){
//            a = r.nextInt(5001) + 5000;
//            if(a==5000){
//                System.out.println(a);
//            }
//        }

        /**
         * 测试可变参数的方法用数组来传
         */
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(1);
//        numberList.add(2);
//        Integer[] numbers = numberList.toArray(new Integer[numberList.size()]);
////        int[] numbers = new int[]{1,2};
//        
//        System.out.println(new Integer[]{}.length==0?0:1);
//        
//        Student s =  new Student();
//        s.sumUp(new Integer[]{}.length==0?numbers:new Integer[]{1});
//        s.sumUp(numbers);
//        Parent p = null;
//        Parent p2 = new Parent(new Student(5));
//
//        Student s = new Student();
//        p = s.print(p);

//        System.out.println(p==null?0:1);
//        System.out.println(p.getAge());
//        System.out.println(p.getStudent().getAge());
//        int ai = 0;
//        for(int i=0;i<2;i++){
//            int b = 0;
//            int b_grow = 0;
//            for(int j=0;j<5;j++){
//                b += new Random().nextInt(5);
//            }
//            
//        }
//        
//        
//        System.out.println(UUID.randomUUID().toString());

//        int a = 1;
//        a = doAdd(a);
//        System.out.println(a);
        Pattern p = Pattern.compile("^\\d{1,9}(.\\d{1,2})?$");
        Matcher m = p.matcher("666666541.13");
        boolean b = m.matches();
        System.out.println(b);
//          System.out.println(-2>>4);
//        BigDecimal b = new BigDecimal(100.50);
//        System.out.println(b.toString());
        // 测试indexOf   结果是可以用中文的字符来分隔
//        String a = "黄色、红色";
//        
//        String[] split = a.split("、");
//        if(a.indexOf("、")>-1){
//            System.out.println("111");
//        }
//        for(String s: split){
//            System.out.println(s);
//        }
//        MapTestObject mto = new MapTestObject();
//        mto.setOrderType(OrderType.TWO);
//        
//        String str = "\":\"";
//        System.out.println(str);
//        String a = "黄色,红色";
////
//        String[] splits = a.split(".");
//        List<String> asList = Arrays.asList(splits);

//        String last = "黄色";
//        String last = "白色";
//        String last = "红色";
//        if (!asList.isEmpty()) {
//            if (asList.indexOf(last) > -1) {
//                int indexOf = asList.indexOf(last);
//                if (indexOf + 1 >= asList.size()) {
//                    System.out.println("没有下个状态");
//                }else{
//                    String next = asList.get(indexOf + 1);
//                    if (OTHERStringUtils.isEmpty(next)) {
//                        System.out.println("没有下个状态");
//                    } else {
//                        System.out.println("下个状态：" + next);
//                    }
//                }
//            } else {
//                System.out.println("上个状态错误");
//            }
//        } else {
//            System.out.println("状态列表未解析正确");
//        }

//           System.out.println("上个状态错误\",\""); 
//           String a ="1123";
//           a = StringUtils.substring(a, 0, a.length()-1);
//           System.out.println("a="+a);
//           
        int a = 0x12345678;  
        ByteArrayOutputStream baos = new ByteArrayOutputStream();  
        DataOutputStream dos = new DataOutputStream(baos);  
        dos.writeInt(a);  
        System.out.println(Integer.toHexString(a));
        byte[] c = baos.toByteArray();  
        for(int i = 0;i<4;i++){  
            System.out.println(Integer.toHexString(c[i]));  
        }     
    }

//    public static int doAdd(int a){
//        return a = a+1;
//    }
}
