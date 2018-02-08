package com.zms.demo1.entiy;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class Managerment implements Serializable {
    @JsonProperty("id")
    private Integer mid;
    @JsonProperty("name")
    private String mname;
    @JsonProperty("_parentId")
    private Integer parentId;



    public Managerment() {
    }



    public Managerment(Integer mid, String mname, Integer parentId) {
        this.mid = mid;
        this.mname = mname;
        this.parentId = parentId;
    }



    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
