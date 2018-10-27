package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午11:07
 * @描述: 工作人员登录控制的逻辑处理
 */
public class WorkerLogin {

    public boolean login(WorkerLoginModel wlm) {
        // 密码加密
        wlm.setPwd(encryptPwd(wlm.getPwd()));
        WorkerUserModel wum = findWorkerByWorkerId(wlm.getWorkerId(), wlm.getPwd());
        if (wum == null) {
            return false;
        }
        return true;
    }

    private String encryptPwd(String pwd) {
        // 这里就示意一下，就不做具体实现了
        return pwd;
    }

    private WorkerUserModel findWorkerByWorkerId(String workId, String pwd) {
        WorkerUserModel wum = new WorkerUserModel();
        wum.setWorkId(workId);
        wum.setPwd(pwd);
        wum.setName("Worker1");
        wum.setUuid("Worker0001");
        return wum;
    }
}
