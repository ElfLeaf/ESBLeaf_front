package com.elfleaf.esb.db.user.model;

/**
 * 角色与权限对照关系表
 */
public class Role_Privilege {
    /**id**/
    protected Long id;
    /**角色id**/
    protected Long role_id;
    /**权限id**/
    protected Long privilege_id;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getRole_id() {
        return role_id;
    }
    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    public Long getPrivilege_id() {
        return privilege_id;
    }
    public void setPrivilege_id(Long privilege_id) {
        this.privilege_id = privilege_id;
    }
    

    
    
}
