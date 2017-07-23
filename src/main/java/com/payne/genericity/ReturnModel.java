/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.genericity;

import com.payne.model.BusinessException;

/**
 *
 * @author Administrator
 */
public class ReturnModel<M> extends StatusModel {
    private M model;

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
    
    public static ReturnModel errorReturn(String msg){
        ReturnModel returnModel = new ReturnModel();
        returnModel.setStatus("error");
        returnModel.setMsg(msg);
        return returnModel;
    }
    
    public static <M> ReturnModel successReturn(M model){
        ReturnModel returnModel = new ReturnModel();
        returnModel.setStatus("success");
        returnModel.setMsg("获取成功");
        returnModel.setModel(model);
        return returnModel;
    }
    
    public static ReturnModel showBusinessExceptionMsg(BusinessException ex){
        return ReturnModel.errorReturn(ex.getMessage());
    }
}
