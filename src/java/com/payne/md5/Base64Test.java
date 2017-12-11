/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.payne.md5;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author peng.dengp
 */
public class Base64Test {
    public static void main(String[] args) throws UnsupportedEncodingException, IOException, NoSuchAlgorithmException {
         String encode = Base64.encode("201703030000000007266440".getBytes("utf-8"));
         
        System.out.println("Base64 encode = "+encode);
//        byte[] decode = Base64.decode(encode);
//        System.out.println("Base64 decode = "+new String(decode));
//        
//        
//        BASE64Encoder base64en = new BASE64Encoder();
//        BASE64Decoder base64de = new BASE64Decoder();
//        String encode1 = base64en.encode("201703030000000007266440".getBytes("utf-8"));
//        
//        System.out.println("BASE64Encoder encode = "+ encode1);
//        System.out.println("BASE64Encoder decode = "+new String(base64de.decodeBuffer(encode1)));
//        
//        MessageDigest md5=MessageDigest.getInstance("MD5");
//        byte[] digest = md5.digest("201703030000000007266440".getBytes("utf-8"));
//        System.out.println("encode2 ="+new String(digest));
//        
//        //加密后的字符串
//        String newstr=base64en.encode(md5.digest("201703030000000007266440".getBytes("utf-8")));
//         System.out.println("newstr = "+newstr);
//        
//        
//        System.out.println("decode2 ="+new String(base64de.decodeBuffer(newstr)));
    }
}
