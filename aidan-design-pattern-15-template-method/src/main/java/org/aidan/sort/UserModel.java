package org.aidan.sort;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午4:53
 * @描述: 用户数据模型
 */
public class UserModel {

    private String userId;
    private String name;
    private int age;

    public UserModel() {
    }

    public UserModel(String userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
