/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

import java.math.BigDecimal;

/**
 *
 * @author Administrator
 */
public class BaseResultReturn {
    private String dimensionX;
    
    private double dimensionY;
    
//    private BigDecimal dimensionY;

    public String getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(String dimensionX) {
        this.dimensionX = dimensionX;
    }

    public double getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(double dimensionY) {
        this.dimensionY = dimensionY;
    }
    
    
}
