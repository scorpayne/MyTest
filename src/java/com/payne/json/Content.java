/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.json;

import java.util.Map;

/**
 *
 * @author peng.dengp
 */
public class Content {
    private String title;
    
    private int number;
    
    private Map<String,String> contentMap;

    public Content() {
    }
   
    public Content(String title, int number, Map<String, String> contentMap) {
        this.title = title;
        this.number = number;
        this.contentMap = contentMap;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Map<String, String> getContentMap() {
        return contentMap;
    }

    public void setContentMap(Map<String, String> contentMap) {
        this.contentMap = contentMap;
    }
    
    
}
