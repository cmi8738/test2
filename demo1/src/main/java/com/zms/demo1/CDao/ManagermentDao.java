package com.zms.demo1.CDao;

import com.zms.demo1.entiy.Managerment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ManagermentDao {

    List<Managerment> findAllManagerment();

}
