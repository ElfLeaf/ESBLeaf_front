package com.elfleaf.esb.db.user.model;

import java.util.Date;

/**
 * 用户表
 */
public class User {
    /**用户id**/
    protected Integer id;
    /**用户名**/
    protected String username;
    /**密码**/
    protected String password;
    /**email**/
    protected String email;
    /**权限角色id**/
    protected Integer role_id;
    /**注册时间**/
    protected Date createdAt;
    
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public Integer getRole_id() {
        return role_id;
    }
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
}