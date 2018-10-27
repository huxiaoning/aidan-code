package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午11:12
 * @描述: 描述登录人员登录时填写信息的数据模式
 */
public class WorkerLoginModel {

    private String workerId;
    private String pwd;

    @Override
    public String toString() {
        return "WorkLoginModel{" +
                "workerId='" + workerId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
