package org.aidan.generalized;

/**
 * @author Aidan
 * @创建时间：2018/9/26 下午4:08
 * @描述: 人员类
 */
public class User {

    /**
     * 人员编号
     */
    private String userId;

    /**
     * 人员名称
     */
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean dimission() {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }
}
