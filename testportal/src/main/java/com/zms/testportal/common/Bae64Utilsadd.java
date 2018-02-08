package com.zms.testportal.common;

import java.util.Base64;

public class Bae64Utilsadd {


    //编码
    public static void main(String[] args) {

        System.out.println(encode("fasgsagsafgsadasg"));

    }
    //编码
    public static String encode(String src){
        return Base64.getEncoder().encodeToString(src.getBytes());

    }
    //解码
    public static String decode(String src){
        byte[] bytes = Base64.getDecoder().decode(src);
        String s = new String(bytes);
        return s;
    }


}
