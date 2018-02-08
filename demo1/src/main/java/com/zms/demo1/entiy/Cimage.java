package com.zms.demo1.entiy;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Cimage implements Serializable{

    private Integer cimid;

    private String imcite;

    public Cimage() {
    }

    public Cimage(Integer cimid, String imcite) {
        this.cimid = cimid;
        this.imcite = imcite;
    }

    public Integer getCimid() {
        return cimid;
    }

    public void setCimid(Integer cimid) {
        this.cimid = cimid;
    }

    public String getImcite() {
        return imcite;
    }

    public void setImcite(String imcite) {
        this.imcite = imcite;
    }
}
