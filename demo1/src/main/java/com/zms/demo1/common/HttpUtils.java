package com.zms.demo1.common;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpUtils {

    public static String getHtml(String path){

        try {
            //1.转化为url
            URL url = new URL(path);
            //2.获得connection
            URLConnection urlConnection = url.openConnection();

            //3.获得读取刘
            InputStream inputStream = urlConnection.getInputStream();

            byte bs[] = new byte[1024];
            int count = 0;
            StringBuilder sb = new StringBuilder();

            while((count = inputStream.read(bs)) != -1 ){
                sb.append(new String(bs, 0, count));
            }
            return sb.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }


    public static void main(String[] args) {
        System.out.println(getHtml("http://www.baidu.com"));
    }





}
