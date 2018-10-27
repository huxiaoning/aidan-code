package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午11:00
 * @描述: 用户信息数据模型
 */
public class UserModel {

    private String uuid;
    private String userId;
    private String pwd;
    private String name;

    @Override
    public String toString() {
        return "UserModel{" +
                "uuid='" + uuid + '\'' +
                ", userId='" + userId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
