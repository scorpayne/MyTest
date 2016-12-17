/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.tree;

import java.util.List;

/**
 *
 * @author Administrator
 */
public interface InheritedNode<T> {
    public boolean isChildFrom(T node);  
    public boolean isBrother(T node);  
    public void addChildNode(T node);  
    public List<T> getChildNodes();
}
