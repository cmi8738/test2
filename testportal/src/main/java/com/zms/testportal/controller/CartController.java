package com.zms.testportal.controller;

import com.sun.deploy.net.HttpResponse;
import com.zms.testportal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartService cm;

    @RequestMapping("add/{sku}")
    public String addCart(@CookieValue(name="cart", required = false) String cartc,@PathVariable String sku, Model model, HttpServletResponse response){
        System.out.println(sku + "00000000000000000000000000000");
        cm.addCartService(cartc,sku,model,response);

        return "cart";
    }

    //更新数量
    @RequestMapping("updateCart/{sku}/{num}")
    public String updateCart(@PathVariable String sku, @PathVariable int num,@CookieValue(value="cart",required = false) String cart){
        System.out.println(sku + "oooooooooooooooooooooooooo");
        System.out.println("购物车 + }}}}}}}}}}}}}}}}}}}}}}}}}}}" + cart);
        cm.updateCartService(sku,num);
        return "";
    }


}
