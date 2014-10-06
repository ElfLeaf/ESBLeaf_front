package com.elfleaf.esb.db.user.model;

/**
 * 权限角色表
 */
public class Role {
    /**角色id**/
    protected Integer id;
    /**角色名**/
    protected String role_name;
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    
}
