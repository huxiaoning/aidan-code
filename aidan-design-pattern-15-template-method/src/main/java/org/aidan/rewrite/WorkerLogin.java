package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:46
 * @描述: 工作人员登录控制的逻辑处理
 */
public class WorkerLogin extends LoginTemplate {
    @Override
    LoginModel findLoginUser(String loginId) {
        LoginModel dblm = new LoginModel();
        dblm.setLoginId(loginId);
        dblm.setPwd("workerPwd");
        return dblm;
    }


    @Override
    String encryptPwd(String pwd) {
        System.out.println("使用Md5进行密码加密");
        return pwd;
    }
}
