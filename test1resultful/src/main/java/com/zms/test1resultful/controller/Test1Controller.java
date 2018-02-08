package com.zms.test1resultful.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test1Controller {
    @RequestMapping("test3")
    public String test3(){

        return "sum(3)";
    }
}
