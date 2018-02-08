package com.zms.demoresultful.controller;

import com.alibaba.fastjson.JSON;
import com.zms.demoresultful.entiy.Category;
import com.zms.demoresultful.entiy.Commidty;
import com.zms.demoresultful.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService cs;
    @RequestMapping("getCategoryController")
    public String  getCategoryController(){

        List<Category> x=cs.getCategoryService();
        String json = JSON.toJSONString(x);


        return json;



    }


    @RequestMapping("getAllCommidtyByCidController/{cid}")
    public List<Commidty>   getAllCommidtyByCidController(@PathVariable String cid){
        return  cs.getAllCommidtyByCidService(cid);

    }



}
