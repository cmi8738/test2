package com.zms.testresultful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

    @RequestMapping("test2")
    public String test2(){
        return "s1(100)";
    }
}
