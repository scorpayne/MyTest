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

    private Student student;
    
    private int age;
    
    public Parent(Student student) {
        this.student = student;
    }

    public StatusModel<String> translate(String words) {
        StatusModel<String> result = null;
        try {
            result = student.speak(words);
        } catch (BusinessException ex) {
            return StatusModel.showBusinessMsg(ex, "说话", ex.getMessage());
        }
        return result;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
