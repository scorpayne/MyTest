/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import com.payne.model.Parent;
import com.payne.model.Student;

/**
 *
 * @author Administrator
 */
public class StringTest {

    public static void main(String[] args) {
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
        Parent p = null;
        Parent p2 = new Parent(new Student(5));

        Student s = new Student();
        p = s.print(p);

//        System.out.println(p==null?0:1);
//        System.out.println(p.getAge());
        System.out.println(p.getStudent().getAge());

    }
}
