package org.aidan.unshare;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午4:43
 * @描述: 描述授权数据的享元接口
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和权限，是否和享元对象的内部状态匹配
     *
     * @param securityEntity
     * @param permit
     * @return
     */
    boolean match(String securityEntity, String permit);


    void add(Flyweight f);
}
