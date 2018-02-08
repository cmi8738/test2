package Oqueue;

import java.io.Serializable;

public class Book implements Serializable{

    private String bname;

    private float bprice;


    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public float getBprice() {
        return bprice;
    }

    public void setBprice(float bprice) {
        this.bprice = bprice;
    }
}
