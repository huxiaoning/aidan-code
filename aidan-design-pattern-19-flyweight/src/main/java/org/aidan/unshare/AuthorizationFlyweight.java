package org.aidan.unshare;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午2:54
 * @描述: 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    /**
     * 内部状态 安全实体
     */
    private String securityEntity;

    /**
     * 内部状态 权限
     */
    private String permit;

    public AuthorizationFlyweight(String state) {
        String[] ss = state.split(",");
        this.securityEntity = ss[0];
        this.permit = ss[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity) && this.permit.equals(permit)) {
            return true;
        }
        return false;
    }

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
