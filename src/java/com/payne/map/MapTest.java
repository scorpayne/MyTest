/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.map;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.amfproject.other.core.utils.OTHERStringUtils;

/**
 *
 * @author Administrator
 */
public class MapTest {
    
    public static void main(String[] args) {
//        MapTestObject m = new MapTestObject();
//        
//        if(m.getMap()!=null){
//           System.out.println("等等");
//        }
//        System.out.println(m.getMap().isEmpty());
//        
//        System.out.println(m.getMap().toString());
//        if(OTHERStringUtils.isEmpty(m.getMap().toString())){
//            System.out.println("空");
//        }
        Map<String,Object> hashMap = new HashMap();
        Map<String,Object> map = new TreeMap<>();
        hashMap.put("1add", 1);
        hashMap.put("2gads", 2);
        hashMap.put("ase3", 3);
        hashMap.put("ee4", 4);
        hashMap.put("ba5", 5);
        for(Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        Map<String,Object> map2 = new TreeMap<>();
        map2.putAll(hashMap);
       for(Map.Entry<String,Object> entry:map2.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
         
    }
    
}
