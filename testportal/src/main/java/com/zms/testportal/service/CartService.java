package com.zms.testportal.service;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.TypeReference;
import com.zms.testportal.common.Bae64Utilsadd;
import com.zms.testportal.common.HttpUtils;
import com.zms.testportal.entiy.Commidty;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class CartService {

   Map<String, Commidty> map = null;

    public void addCartService(String cartc,String sku, Model model, HttpServletResponse response){
        System.out.println(sku + "service");
        if (StringUtils.isEmpty(cartc)){
            map = new LinkedHashMap<>();
        } else {
            String bytes = Bae64Utilsadd.decode(cartc);
            map = JSON.parseObject(bytes,new TypeReference<Map<String,Commidty>>(){}); // 转化不匹配

        }



        String json = HttpUtils.getHtml("http://localhost:8083/commidty/findCommidtyByCid/" + sku);

        Commidty com = JSON.parseObject(json,Commidty.class);
      //  com.setNum(1);

        map.put(sku,com);
        model.addAttribute("cs",map.values());
       // model.addAttribute("totalprice",total(cartc));

        //把cookie添加到浏览器
        response.addCookie(createCookie(map));

    }

    //3.创建cookie
    public Cookie  createCookie(Map<String,Commidty> map){
        String json = JSON.toJSONString(map);
        Cookie cookie = new Cookie("cart", Bae64Utilsadd.encode(json));
        cookie.setMaxAge(60*5);
        //设置cookie的有效范围

        cookie.setPath("http://localhost:8082");

        return cookie;
    }

    //1.计算总价款
    public float total(String cartc){
        float x = 0;
        Map<String,Commidty> map = getCartByCookie(cartc);
        //得到所有的商品
        Collection<Commidty> allcommidty = map.values();

//        for (Commidty c:allcommidty) {
//            x +=c.getPrice()*c.getNum();
//        }



        return x;
    }

    //获取购物车
    public Map<String,Commidty> getCartByCookie(String cartc){


        return map;
    }


    public void  updateCartService(String sku, int num) {





    }
}
