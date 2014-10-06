package com.elfleaf.esb.db.user.model;

/**
 * 权限表
 */
public class Privilege {
    /**权限id**/
    protected Long id;
    /**权限名**/
    protected String privilege_name;
    
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPrivilege_name() {
        return privilege_name;
    }
    public void setPrivilege_name(String privilege_name) {
        this.privilege_name = privilege_name;
    }
    
    

    
}
