package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:17
 * @描述: 具体的被代理的真实对象
 */
public class UserModel implements UserModelApi {
    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 部门编号
     */
    private String depId;

    /**
     * 性别
     */
    private String sex;

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDepId() {
        return depId;
    }

    @Override
    public void setDepId(String depId) {
        this.depId = depId;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", depId='" + depId + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
