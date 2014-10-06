package com.elfleaf.esb.db.user.model;

/**
 * 角色与权限对照关系表
 */
public class Role_Privilege {
    /**id**/
    protected Integer id;
    /**角色id**/
    protected Integer role_id;
    /**权限id**/
    protected Integer privilege_id;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getRole_id() {
        return role_id;
    }
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
    public Integer getPrivilege_id() {
        return privilege_id;
    }
    public void setPrivilege_id(Integer privilege_id) {
        this.privilege_id = privilege_id;
    }
    
    
}
