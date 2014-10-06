package com.elfleaf.esb.db.user.model;

/**
 * 权限表
 */
public class Privilege {
    /**权限id**/
    protected Integer id;
    /**权限名**/
    protected String privilege_name;
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPrivilege_name() {
        return privilege_name;
    }
    public void setPrivilege_name(String privilege_name) {
        this.privilege_name = privilege_name;
    }
    
    
}
