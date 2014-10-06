package com.elfleaf.esb.db.user.model;

import java.util.Date;

public class User {
    /**用户id**/
    protected Integer id;
    /**用户名**/
    protected String username;
    /**密码**/
    protected String password;
    /**email**/
    protected String email;
    /**注册时间**/
    protected Date createdAt;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUname() {
        return username;
    }
    public void setUname(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    
    
}