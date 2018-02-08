package com.zms.demo1.CDao;


import com.zms.demo1.entiy.Commidty;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommidtyDao {

    List<Commidty> findAllCommidty();

    //添加数据时删除缓存
    @CacheEvict(value="findAllCommidty")
    void addCommidty(Commidty commidty);


    Commidty findCommidtyDaoByCid(Integer cid);
}
