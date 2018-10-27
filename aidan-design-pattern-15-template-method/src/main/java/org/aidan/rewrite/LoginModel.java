package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午2:31
 * @描述: 封装进行登录控制所需要的数据
 */
public class LoginModel {

    private String loginId;

    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
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
                "loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
