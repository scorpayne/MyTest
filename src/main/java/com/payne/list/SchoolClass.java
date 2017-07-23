/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.list;

import com.payne.model.Student;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SchoolClass {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "SchoolClass{" + "students=" + students + '}';
    }
    
}
