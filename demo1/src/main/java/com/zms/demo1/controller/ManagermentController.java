package com.zms.demo1.controller;

import com.zms.demo1.Service.ManagermentService;
import com.zms.demo1.entiy.Managerment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ManagermentController {
    @Resource
    private ManagermentService ms;


    @RequestMapping("findAllManagerments")
    public List<Managerment> findAllManagerments(){
        return ms.findManagerments();
    }




}
