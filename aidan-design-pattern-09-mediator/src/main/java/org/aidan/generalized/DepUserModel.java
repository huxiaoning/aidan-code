package org.aidan.generalized;

/**
 * @author Aidan
 * @创建时间：2018/9/26 下午4:11
 * @描述: 描述部门和人员关系的类
 */
public class DepUserModel {

    /**
     * 部门和人员关系的编号，用作主键
     */
    private String depUserId;

    /**
     * 部门编号
     */
    private String depId;

    /**
     * 人员编号
     */
    private String userId;

    public String getDepUserId() {
        return depUserId;
    }

    public void setDepUserId(String depUserId) {
        this.depUserId = depUserId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
