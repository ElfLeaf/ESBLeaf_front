package com.elfleaf.esb.db.user.model;

/**
 * 用户与角色关系表
 */
public class User_Role {
    protected Long id;
    /**用户id**/
    protected Long user_id;
    /**id**/
    protected Long role_id;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public Long getRole_id() {
        return role_id;
    }
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    
    
    
}
