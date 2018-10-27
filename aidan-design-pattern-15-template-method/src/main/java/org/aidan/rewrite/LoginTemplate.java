package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:32
 * @描述: 登录控制的模板
 */
public abstract class LoginTemplate {

    public final boolean login(LoginModel lm) {
        // 1 根据登录人员的编号去获取相应的数据
        LoginModel dblm = findLoginUser(lm.getLoginId());
        if (dblm == null) {
            return false;
        }
        // 2 对密码进行加密
        lm.setPwd(encryptPwd(lm.getPwd()));
        // 3 匹配
        return match(lm, dblm);
    }

    abstract LoginModel findLoginUser(String loginId);

    String encryptPwd(String pwd) {
        return pwd;
    }

    private boolean match(LoginModel lm, LoginModel dblm) {
        if (!lm.getLoginId().equals(dblm.getLoginId())) {
            return false;
        }
        if (!lm.getPwd().equals(dblm.getPwd())) {
            return false;
        }
        return true;
    }
}
