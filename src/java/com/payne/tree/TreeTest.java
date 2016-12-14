/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.tree;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class TreeTest {
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        LinkedList<SimpleNode> list = new LinkedList<SimpleNode>();  
        list.add(new SimpleNode("B2", "B"));  
        list.add(new SimpleNode("D", "A"));  
        list.add(new SimpleNode("C2", "C"));  
        list.add(new SimpleNode("C12", "C1"));  
        list.add(new SimpleNode("D11", "D1"));  
        list.add(new SimpleNode("B1", "B"));  
        list.add(new SimpleNode("B11", "B1"));  
        list.add(new SimpleNode("B12", "B1"));  
        list.add(new SimpleNode("C11", "C1"));  
        list.add(new SimpleNode("B22", "B2"));  
        list.add(new SimpleNode("C1", "C"));  
        list.add(new SimpleNode("B", "A"));  
        list.add(new SimpleNode("D1", "D"));  
        list.add(new SimpleNode("C", "A"));  
          
        SimpleNode root = new SimpleNode("A", null);  
        root = TreeUtil.getTree(root, list);  
        System.out.println(root.toString());
          
        TreeUtil.printTreeByDepthFirstTraversal(root); 
        
//        for(SimpleNode s:list){
//            
//        }
          
    }  
}
