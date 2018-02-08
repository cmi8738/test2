package com.zms.demo1.Service;

import com.zms.demo1.CDao.ManagermentDao;
import com.zms.demo1.entiy.Managerment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagermentService {

    @Autowired
    private ManagermentDao md;

    public List<Managerment> findManagerments(){
        return md.findAllManagerment();
    }
}
