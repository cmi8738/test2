package com.zms.testportal.entiy;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Commidty implements Serializable {

    private String sku;

    private String name;

    private float price;

    private int num;

    public Commidty() {
    }

    public Commidty(String sku, String name, float price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
