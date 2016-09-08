/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class UseCaseTracker {

    public static void trackUseCases(List<Integer> list, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UseCase us = m.getAnnotation(UseCase.class);
            if (us != null) {
                System.out.println("Found Use Case:" + us.id() + " "
                        + us.description());
                list.remove(new Integer(us.id()));
            }
        }
        for (int i : list) {
            System.out.println("Warning:Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 47, 48, 49, 50, 51);
        trackUseCases(list, PasswordUtils.class);
    }
}
