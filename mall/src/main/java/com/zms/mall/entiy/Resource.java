package com.zms.mall.entiy;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Component
public class Resource implements Serializable {

    private String id;
    private String text;

    private String url;

    private Set<Resource> children = new HashSet<Resource>();

    public Resource(String id, String text, String url, Set<Resource> children) {
        this.id = id;
        this.text = text;
        this.url = url;
        this.children = children;
    }

    public Resource() { 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<Resource> getChildren() {
        return children;
    }

    public void setChildren(Set<Resource> children) {
        this.children = children;
    }
}
