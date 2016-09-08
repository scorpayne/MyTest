/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

import com.payne.exception.test.MyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.amfproject.other.core.utils.OTHERStringPool;

/**
 *
 * @author Administrator
 */
public class Parent {
    private Student s;

    public Parent() {
    }
    
    public Parent(Student s){
        this.s=s;
    }
    
    public StatusModel<String> translate(String words){
        StatusModel<String> result = null;
        try {
            result = s.speak(words);
        } catch (BusinessException ex) {
            return StatusModel.showBusinessMsg(ex, "说话", ex.getMessage());
        }
        return result;
    }
    
    public void changeStudentAge(Student s){
        s.setAge(20);
    }
}
