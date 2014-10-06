package com.elfleaf.esb.db.user.model;

import java.util.Date;

/**
 * 用户表
 */
public class User {
    /**用户id**/
    protected Long id;
    /**用户名**/
    protected String username;
    /**密码**/
    protected String password;
    /**email**/
    protected String email;
    /**注册时间**/
    protected Date createdAt;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
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