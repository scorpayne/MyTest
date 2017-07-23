/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

/**
 *
 * @author Administrator
 */
public class ResultReturn<T> extends BaseResultReturn{
    private T dimensionZ;

    public T getDimensionZ() {
        return dimensionZ;
    }

    public void setDimensionZ(T dimensionZ) {
        this.dimensionZ = dimensionZ;
    }
    
}
