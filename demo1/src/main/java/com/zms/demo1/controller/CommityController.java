package com.zms.demo1.controller;

import com.zms.demo1.Service.CommidtyService;
import com.zms.demo1.entiy.Commidty;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("commidty")
public class CommityController {

    @Resource
    private CommidtyService cs;

    @RequestMapping("findAllCommodity")
    public List<Commidty> findAllCommodity(){

        return cs.findAllDaoCommidty();
    }


    @RequestMapping("addCommidty")
    public String addCommidty(@RequestParam("f1")MultipartFile file
            , @RequestParam Map<String, String> args){
        System.out.println(file.getOriginalFilename());
        System.out.println(args + "---------------------");
        System.out.println(args.get("content")+"this is ssfafsaf");

        cs.addCommidty(file,args);

        return "1";
    }


    @RequestMapping(value = "shangJiaCommodity/{cid}",method = RequestMethod.GET)
    public String shangJiaCommodity(@PathVariable Integer cid){
        cs.findCommidtyByCid(cid);
        return  "1";
    }





}
