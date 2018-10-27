package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午10:58
 * @描述: 登录人员登录时填写信息的数据模型
 */
public class LoginModel {

    private String userId;

    private String pwd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
