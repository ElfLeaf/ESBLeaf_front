package com.elfleaf.esb.db.user.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elfleaf.esb.db.user.dao.UserDAO;
import com.elfleaf.esb.db.user.model.User;
import com.elfleaf.framework.utils.UtilsLeafRegx;


@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    
    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    /**
     * 根据登录名(可以是用户名/email等方式)查询是否存在这个用户。
     * 若存在则返回用户信息。
     * 若不存在则返回null
     */
    public User findLoginUserInfo(String loginName) {
        //STEP 判断loginName类型
        String loginType = null;
        //判断是否为EMAIL类型
        if (loginName.matches(UtilsLeafRegx.EMAIL_REGX)) {
            loginType = "email";
        } else {
            loginType = "uname";
        }
        
        return userDAO.findLoginUserInfo(loginName, loginType);
    }
    
    /**
     * 根据用户uid，验证uid对应密码是否正确
     * @param id
     * @param password
     * @return
     */
    public Boolean verifyPwd(Long id, String password) {
        User user = userDAO.verifyPwd(id, password);
        return user==null ? false : true;
    }
    
    
}
