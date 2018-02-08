package com.zms.test1resultful.controller;

import com.zms.test1resultful.entiy.Commidty;
import com.zms.test1resultful.service.ComidtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("commidty")
public class CommdtyController {

    @Autowired
    private ComidtyService cs;

    @RequestMapping("findCommidtyByCid/{sku}")
    public Commidty findCommidtyByCid(@PathVariable String sku){
        return  cs.findCommidtyServiceByCid(sku);
    }
}
