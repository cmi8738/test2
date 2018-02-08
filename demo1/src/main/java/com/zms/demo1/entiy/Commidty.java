package com.zms.demo1.entiy;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Commidty implements Serializable {

    private String cname;

    private Integer  cid;

    private Integer price;

    private Integer imid;

    public Commidty() {
    }

    public Commidty(String cname, Integer cid, Integer price, Integer imid) {
        this.cname = cname;
        this.cid = cid;
        this.price = price;
        this.imid = imid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getImid() {
        return imid;
    }

    public void setImid(Integer imid) {
        this.imid = imid;
    }
}
