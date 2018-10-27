package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午10:57
 * @描述: 普通用户登录的逻辑控制
 */
public class NormalLogin {

    public boolean login(LoginModel lm) {
        UserModel um = this.findUserByUserId(lm.getUserId(), lm.getPwd());
        if (um == null) {
            return false;
        }
        return true;
    }

    private UserModel findUserByUserId(String userId, String pwd) {
        UserModel um = new UserModel();
        um.setUserId(userId);
        um.setPwd(pwd);
        um.setName("test");
        um.setUuid("User0001");
        return um;
    }
}
