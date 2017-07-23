/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

import org.amfproject.other.platform.rpc.OTHERRPCException;

/**
 *
 * @author Administrator
 */
public class BusinessException extends OTHERRPCException{
    public final static int OBJECT_NO_FOUND = 500001;
    
    
    public BusinessException(Throwable ex, int code) {
        super(ex,code);
    }

    public BusinessException(String ex, int code) {
        super(ex,code);
    }
}
