/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payne.model.Student;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.amfproject.other.core.utils.OTHERObjectMapperUtils;

/**
 *
 * @author Administrator
 */
public class JSONObjectTest {

    public static void main(String[] args) throws ParseException {
//        JSONArray a = null;
//        String b ="[{'id':10,'serviceId':13,'b2bProductId':10,'accessoryName':'nimeiya','accessoryBrand':'test','price':10000,'accessoryNum':'1','createdTime':'2016-03-14T14:21:35+08:00','updateTime':'2016-03-14T14:21:35+08:00','status':'NORMAL'}]";
//        a = new JSONArray(b);
//        System.out.println(a);
//        List<String> l1 = new ArrayList<String>();  
//        l1.add("a");  
//        l1.add("a");  
//        l1.add("c");  
//        l1.add("c");  
//          
//        List<String> l2 = new ArrayList<String>();  
//        l2.add("b");  
//        l2.add("b");  
//        l2.add("k");  
//        l2.add("k");  
//          
//        l1.removeAll(l2);//此处指的是将与l2重复的删除  
//        l1.addAll(l2);//此处指加上l2  
//          
//        //如果保证l1,和l2  2个各自的LIST 本身不重复，此行代码不用写。否则会出现合并后LIST重复的问题，具体看业务需要  
//        l1 = new ArrayList<String>(new HashSet<>(l1));  
//          
//        for(String str : l1){  
//            System.out.println(str);  
//        }
//        List<Long> vipUserIds = new ArrayList<Long>();
//        vipUserIds.add(123l);
//        vipUserIds.add(122l);
//        vipUserIds.add(122l);
//        vipUserIds.add(121l);
//
//        List<Long> orderUserIds = new ArrayList<Long>();
//        orderUserIds.add(100l);
//        orderUserIds.add(100l);
//        orderUserIds.add(121l);
//        orderUserIds.add(120l);
//        orderUserIds.add(180l);
//        
//        vipUserIds.removeAll(orderUserIds);
//        vipUserIds.addAll(orderUserIds);
//        
//        vipUserIds = new ArrayList<Long>(new HashSet<>(vipUserIds));  
//        
//        Comparator<Long> com = new Comparator<Long>() {
//            public int compare(Long l1, Long l2) {
//                BigDecimal bd1 = new BigDecimal(l1);
//                BigDecimal bd2 = new BigDecimal(l2);
//                BigDecimal bd3 = bd1.subtract(bd2);
//                return -(bd3.intValue());
//            }
//        };
//        Collections.sort(vipUserIds,com);
////        Collections.sort(vipUserIds, new Comparator<Long>(){  
////            public Long compare(Long l1, Long l2){  
////                BigDecimal bd1 = new BigDecimal(l1);
////                BigDecimal bd2 = new BigDecimal(l2);
////                BigDecimal bd3 = bd1.subtract(bd2);
////                return bd3.longValue();
////            }
////        });
//        for(Long userId : vipUserIds){  
//            System.out.println(userId);  
//        }

        /**
         * 测试ObjectMapper 的 writeValueAsString 可以转换map list
         */
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = new ArrayList<>();

        List<String> categoryList = new ArrayList<>();
        categoryList.add("学生1");
        categoryList.add("学生2");

        Map<String, Integer> map = new HashMap<>();
        map.put("学生1", 155);
        map.put("学生2", 160);
        
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("key = "+entry.getKey()+",value = "+entry.getValue());
        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
        students.add(new Student(10));
        students.add(new Student(20));
        String writeValueAsString = "";
        try {
//            writeValueAsString = mapper.writeValueAsString(students);
//            writeValueAsString = mapper.writeValueAsString(categoryList);
            writeValueAsString = mapper.writeValueAsString(map);
//            writeValueAsString = OTHERObjectMapperUtils.getDefaultJSONMapper().writeValueAsString(map);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(JSONObjectTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(writeValueAsString);
    }
}
