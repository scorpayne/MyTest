/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author peng.dengp
 */
public class JSONTest {
    public static void main(String[] args) throws JsonProcessingException{
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","123");
        map.put("2","456");
        
        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("3","789");
        map2.put("4","101");
        Content c = new Content("hello",1,map);
        Content c2 = new Content("hi",2,map2);
        List<Content> contentList = new ArrayList<Content>();
        contentList.add(c);
        contentList.add(c2);
        
        ObjectMapper om = new ObjectMapper();
        String writeValueAsString = om.writeValueAsString(contentList);
        
        JSONArray jsonArray = new JSONArray(writeValueAsString);
        
        for(int i=0;i<jsonArray.length();i++){
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            
            if(jsonObject.get("number") instanceof Integer){
                System.out.println("yes,it is Integer type");
                System.out.println(jsonObject.get("number"));
            }
            Object get = jsonObject.get("contentMap");
            if(get instanceof Map){
                System.out.println("yes,it is map type");
            }else if(get instanceof JSONObject){
                System.out.println("yes,it is JSONObject type");
            }else if(get instanceof String){
                System.out.println("yes,it is String type");
            }
            JSONObject mapJsonObject = jsonObject.getJSONObject("contentMap");
            System.out.println(mapJsonObject.get("1"));
            System.out.println(mapJsonObject.getString("1"));
        }
         
    }
   
    
}
