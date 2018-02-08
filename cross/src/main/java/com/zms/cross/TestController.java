package com.zms.cross;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.spi.http.HttpContext;

@RestController
public class TestController {


    @RequestMapping("test1")
    public String test1(){

        String a = "welcome cross-domain";
        return a;
    }
}
