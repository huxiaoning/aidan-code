package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/11/1 下午6:15
 * @描述: 描述授权数据的数据模型
 */
public class AuthorizationModel {

    /**
     * 人员
     */
    private String user;

    /**
     * 安全实体
     */
    private String securityEntity;

    /**
     * 权限
     */
    private String permit;

    public AuthorizationModel(String user, String securityEntity, String permit) {
        this.user = user;
        this.securityEntity = securityEntity;
        this.permit = permit;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public void setSecurityEntity(String securityEntity) {
        this.securityEntity = securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    @Override
    public String toString() {
        return "AuthorizationModel{" +
                "user='" + user + '\'' +
                ", securityEntity='" + securityEntity + '\'' +
                ", permit='" + permit + '\'' +
                '}';
    }
}
