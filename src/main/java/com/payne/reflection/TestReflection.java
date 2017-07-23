/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class TestReflection {

    public static void main(String[] args) throws Exception {
        String entityClassName = "com.payne.reflection.Student";
        Student s = new Student();
        s.setAge(20);
        s.setName("张三");
        s.setPocketMoney(BigDecimal.TEN);

//        Method method =  Class.forName(entityClassName).getMethod("getPocketMoney", null);
//        Method method =  Class.forName(entityClassName).getMethod("getName", null);
//        Method method =  Class.forName(entityClassName).getMethod("getAge", null);
        Class<?> cls = Class.forName(entityClassName);
        Method method2 = cls.getMethod("getAge", null);
        Object invoke = method2.invoke(s, null);
        System.out.println(invoke.toString());

        System.out.println(s.getClass().getName());

        Field[] declaredFields = cls.getFields();
        for (Field f : declaredFields) {
            System.out.println(f.getName());
        }

//        if(method.invoke(s, null) instanceof BigDecimal){
//            System.out.println("YES");
//            System.out.println(new BigDecimal(method.invoke(s, null).toString()).doubleValue());
//        }else if(method.invoke(s, null) instanceof String){
//            System.out.println("YES");
//            System.out.println(method.invoke(s, null).toString());
//        }else if(method.invoke(s, null) instanceof Integer){
//            System.out.println("YES");
//            System.out.println(method.invoke(s, null));
//            
//        }
    }
}
