/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class SimpleNode implements InheritedNode<SimpleNode>{
    private String id;  
    private String fid;
    
    private List<SimpleNode> subSimpleNodeList;  
      
    public SimpleNode(String id, String fid) {  
        this.id = id;  
        this.fid = fid;  
    }  
      
    public void addSubSimpleNode(SimpleNode subSimpleNode) {  
    }  
      
    public String toString() {  
        return id;  
    }  
  
    @Override  
    public void addChildNode(SimpleNode node) {  
        if(subSimpleNodeList == null) {  
            subSimpleNodeList = new ArrayList<SimpleNode>();  
        }  
        subSimpleNodeList.add(node);  
    }  
  
    @Override  
    public List<SimpleNode> getChildNodes() {  
        return subSimpleNodeList;  
    }  
  
    @Override  
    public boolean isBrother(SimpleNode node) {  
        return this.fid.equals(((SimpleNode)node).getFid());  
    }  
  
    @Override  
    public boolean isChildFrom(SimpleNode node) {  
        return this.fid.equals(node.getId());  
    }  
  
    public String getId() {  
        return id;  
    }  
  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    public String getFid() {  
        return fid;  
    }  
  
    public void setFid(String fid) {  
        this.fid = fid;  
    }
}
