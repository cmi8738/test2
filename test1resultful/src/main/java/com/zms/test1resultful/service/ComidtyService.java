package com.zms.test1resultful.service;

import com.zms.test1resultful.dao.CommodtyDao;
import com.zms.test1resultful.entiy.Commidty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComidtyService {
    @Autowired
    private CommodtyDao cd;


    public Commidty findCommidtyServiceByCid(String sku){

        return cd.findCommidtyDaoByCid(sku);

    }
}
