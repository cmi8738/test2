package com.zms.mall.entiy;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Users implements Serializable {


    private String id;

    private String account;

    private String password;

    private String rid;

    private String roleName;

    private String idcard;

    private String vcode;


    public Users(String id, String account, String password, String rid, String roleName) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.rid = rid;
        this.roleName = roleName;
    }

    public Users() {
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", rid='" + rid + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
