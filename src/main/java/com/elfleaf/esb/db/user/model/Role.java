package com.elfleaf.esb.db.user.model;

/**
 * 权限角色表
 */
public class Role {
    /**角色id**/
    protected Long id;
    /**角色名**/
    protected String role_name;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    
}
