package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:50
 * @描述: 模式重写示例 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerPwd");
        LoginTemplate lt = new WorkerLogin();
        LoginTemplate lt2 = new NormalLogin();

        boolean login = lt.login(lm);
        System.out.println("可以登录工作平台:" + login);

        boolean login2 = lt2.login(lm);
        System.out.println("可以进行普通人员登录:" + login2);

    }
}
