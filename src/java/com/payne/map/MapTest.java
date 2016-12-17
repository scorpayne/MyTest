/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.map;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import org.amfproject.other.core.utils.OTHERStringUtils;

/**
 *
 * @author Administrator
 */
public class MapTest {
    
    public static void main(String[] args) {
        MapTestObject m = new MapTestObject();
        
        if(m.getMap()!=null){
           System.out.println("等等");
        }
        System.out.println(m.getMap().isEmpty());
        
        System.out.println(m.getMap().toString());
        if(OTHERStringUtils.isEmpty(m.getMap().toString())){
            System.out.println("空");
        }
         
    }
    
}
