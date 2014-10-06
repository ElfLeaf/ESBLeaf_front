package com.elfleaf.esb.db.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.elfleaf.esb.db.user.model.User;
import com.elfleaf.framework.mybatis.AMyBatisBaseDAO;


@Repository
public class UserDAO extends AMyBatisBaseDAO<User> {

    /**
     * 找出登录名相关登录信息
     * @param LoginName 登录名(可以是用户名/EMAIL多形式)
     * @param loginType 登录名类型,也就是是用户名，还是email或者是手机号类型
     * @return 用户信息
     */
    public User findLoginUserInfo(String loginName,String loginType) {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("loginName", loginName);
        params.put("loginType", loginType);
       
        return this.selectOne("findLoginUserInfo", params);
    }
    
    /**
     * 验证密码正确性
     * @return
     */
    public User verifyPwd(Integer id,String password) {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("id", id);
        params.put("password", password);

        return this.selectOne("verifyPwd", params);
    }
}
