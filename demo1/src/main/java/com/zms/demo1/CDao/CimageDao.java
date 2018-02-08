package com.zms.demo1.CDao;


import com.zms.demo1.entiy.Cimage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface CimageDao {

    List<Cimage> findAllCimage();

    @CacheEvict("findAllCimage")
    void addCimage(Cimage cimage);
}
