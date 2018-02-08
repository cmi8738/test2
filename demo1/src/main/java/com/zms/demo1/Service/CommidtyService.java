package com.zms.demo1.Service;


import com.zms.demo1.CDao.CimageDao;
import com.zms.demo1.CDao.CommidtyDao;
import com.zms.demo1.common.ThreadPool;
import com.zms.demo1.entiy.Cimage;
import com.zms.demo1.entiy.Commidty;

import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;


import javax.annotation.Resource;
import java.io.File;

import java.io.FileOutputStream;
import java.io.FileWriter;

import java.util.List;
import java.util.Map;

@Service
public class CommidtyService {

    @Autowired
    private Commidty com;

    @Resource
    private FreeMarkerConfig freeMarkerConfig;

    @Autowired
    private Cimage cim;

    @Autowired
    private CommidtyDao cod;

    @Autowired
    private CimageDao cid;

    public List<Commidty> findAllDaoCommidty(){
        return cod.findAllCommidty();
    }

    @Transactional
    public void addCommidty(MultipartFile file, Map<String, String> args){

        System.out.println("开始时间" + System.currentTimeMillis());

        ThreadPool.pool.execute(new Runnable() {
            @Override
            public void run() {
                File file1 = new File("D:/image/" + file.getOriginalFilename());

                try {
                    FileOutputStream out = new FileOutputStream(file1);
                    file.transferTo(file1);
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        String cname = args.get("name");
        Integer price = Integer.parseInt(args.get("price"));
//        com.setCname(cname);c
//        com.setPrice(price);
//        com.setCid(1);
//        com.setImid(2);
        cim.setCimid(2);
        cim.setImcite(file.getOriginalFilename());
        //cod.addCommidty(com);
        cid.addCimage(cim);
        //将数据存入数据库中

        System.out.println("结束时间" + System.currentTimeMillis());


    }

    public void findCommidtyByCid(Integer cid) {
        Commidty co = cod.findCommidtyDaoByCid(cid);

        try {
            Template template = freeMarkerConfig.getConfiguration().getTemplate("item.ftl");

            String htmlName = "D:/image/" + cid  + ".html";
            FileWriter out = new FileWriter(htmlName);
            template.process(co,out);
            template.dump(out);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
