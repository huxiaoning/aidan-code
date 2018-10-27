package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:42
 * @描述: 普通用户登录控制的逻辑处理
 */
public class NormalLogin extends LoginTemplate {
    @Override
    LoginModel findLoginUser(String loginId) {
        // 省略具体的处理，仅做示意
        LoginModel dblm = new LoginModel();
        dblm.setLoginId(loginId);
        dblm.setPwd("testPwd");
        return dblm;
    }
}
