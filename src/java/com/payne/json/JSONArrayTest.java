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
public class JSONArrayTest {
    public static void main(String[] args) throws JsonProcessingException{
        String a = "[{contentInfoMap:{title:'11111',contentUrl:'adTest/4444414_104435_9093.jpg'},seqNum:'1503283721452',linkUrl:'c_1574166_MjAxNzExMTAwMDAwMDAwMDAwNTQ3MzI0'},{contentInfoMap:{title:'22222',contentUrl:'adTest/4444414_104435_9093.jpg'},seqNum:'1503284101215',linkUrl:'a_2197212_MjAxNzAzMDMwMDAwMDAwMDA3MjY2NDQw'}]";
        
        JSONArray jsonArray = new JSONArray(a);
        System.out.println(jsonArray.toString());
         
    }
   
    
}
