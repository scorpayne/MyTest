/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payne.md5;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author peng.dengp
 */
public class Client {

    private static Map users = new HashMap();

    public static void main(String[] args) {
        String userName = "zyg";
        String password = "201703030000000007266440";
        registerUser(userName, password);

        userName = "changong";
        password = "201714020000000008433435";
        registerUser(userName, password);

        String loginUserId = "zyg";
        String pwd = "123";
        try {
            if (loginValid(loginUserId, pwd)) {
                System.out.println("欢迎登陆！！！");
            } else {
                System.out.println("口令错误，请重新输入！！！");
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 注册用户
     *
     * @param userName
     * @param password
     */
    public static void registerUser(String userName, String password) {
        String encryptedPwd = null;
        try {
            encryptedPwd = MD5Util.getEncryptedPwd(password);

            users.put(userName, encryptedPwd);

        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 验证登陆
     *
     * @param userName
     * @param password
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    public static boolean loginValid(String userName, String password)
            throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String pwdInDb = (String) users.get(userName);
        if (null != pwdInDb) { // 该用户存在
            return MD5Util.validPassword(password, pwdInDb);
        } else {
            System.out.println("不存在该用户！！！");
            return false;
        }
    }
}
