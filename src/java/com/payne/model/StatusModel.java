/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.model;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class StatusModel<T> extends PayneModel{
    private T model;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
    
    public static StatusModel errorFastRet(String msg) {
        StatusModel statusModel = new StatusModel();
        statusModel.setStatus("error");
        statusModel.setMsg(msg);
        return statusModel;
    }

    public static <T> StatusModel successFastRet(T model) {
        StatusModel statusModel = new StatusModel();
        statusModel.setStatus("ok");
        statusModel.setMsg("获取成功");
        statusModel.setModel(model);
        return statusModel;
    }

    public static StatusModel showBusinessMsg(BusinessException ex, String defaultStr, String voidStr) {
        Exception e = new Exception();
//        System.err.println(ex.);
        switch (ex.getMessage()) {
            case "INVALID_PARAMETER":
                return StatusModel.errorFastRet("参数格式不正确");//pass<6 X
            case "COMPANY_NOT_FOUND":
                return StatusModel.errorFastRet("token未找到");
            case "MOBILE_PHONE_ALREADY_BIND":
                return StatusModel.errorFastRet("这个手机号已经注册过了哦，直接去登陆或者换个号码再试试！");
            case "MOBILE_PHONE_REQUIRED":
                return StatusModel.errorFastRet("手机号不能为空");
            case "CUSTOMER_NOT_FOUND":
                return StatusModel.errorFastRet("这个账号还未注册，赶紧去注册吧");
            case "ALREADY_BIND_OR_PARAM_ERROR":
                return StatusModel.errorFastRet("用户参数格式不正确");
            case "ACCOUNT_EXISTS_PASSWORD_ERROR": case "org.amfproject.other.model.user.UserAccountLoginException: ACCOUNT_OR_PASSWORD_INVALID":
                return StatusModel.errorFastRet("您输入的账号或密码有误，请确认后再次输入！");
            case "ALREADY_BIND_ACCOUNT":
                return StatusModel.errorFastRet("用户已存在");
            case "USER_ACCOUNT_CREATE_ERROR":
                return StatusModel.errorFastRet("用户账号创建失败");
            case "UPDATE_ERROR":
                return StatusModel.errorFastRet("用户信息添加错误");
            //login
            case "LOGIN_INVALID":
                return StatusModel.errorFastRet("这个账号还未注册，赶紧去注册吧！");
            case "VOID":
                return StatusModel.errorFastRet(voidStr);
            case "小学生别乱说话！":
                return StatusModel.errorFastRet("小学生别乱说话"); 
            default:
                return StatusModel.errorFastRet(defaultStr + "失败");

        }
    }

//    public static StatusModel<GoodeaLoginReturn> showSocialShareMsg(SocialShareException ex, String defaultStr, String voidStr) {
//        System.err.println(ex.getMessage());
//        switch (ex.getMessage()) {
//            case "FORMAT_ERROR":
//                return StatusModel.errorFastRet("验证参数格式不正确");
//            case "NOT_EXISTS":
//                return StatusModel.errorFastRet("验证记录未找到");
//            case "ACTIVATE_TIMEOUT":
//                return StatusModel.errorFastRet("验证超时");
//            case "REPETITIVE_BEHAVIOR":
//                return StatusModel.errorFastRet("验证码已经验证");
//            case "DATABASE_ERROR":
//                return StatusModel.errorFastRet("验证信息出错");
//            case "CODE_NOT_CORRECT":
//                return StatusModel.errorFastRet("验证码验证失败，请确认后再次输入或重新获取验证码。");
//            case "VOID":
//                return StatusModel.errorFastRet(voidStr);
//            default:
//                return StatusModel.errorFastRet(defaultStr + "失败");
//        }
//    }         
            
    @Override
    public String toString() {
        String str = super.toString() + "\n status:" + status + "\n msg:" + msg + "\n model:" + model;

        if (null != model && model instanceof List) {
            List list = (List) model;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    str += "\n" + list.get(i);
                }
            }
        }

        return str; //To change body of generated methods, choose Tools | Templates.
    }
}
