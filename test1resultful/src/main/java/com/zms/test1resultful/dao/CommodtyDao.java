package com.zms.test1resultful.dao;

import com.zms.test1resultful.entiy.Commidty;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommodtyDao {


    Commidty findCommidtyDaoByCid(String sku);
}
