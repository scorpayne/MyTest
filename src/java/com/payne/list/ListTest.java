/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.list;

import com.payne.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ListTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        
        SchoolClass sc = new SchoolClass();
        sc.setStudents(students);
        
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            s.setAge(i);
//            students.add(s);
            sc.getStudents().add(s);
        }
        
        System.out.println(sc.toString());
    }
}
