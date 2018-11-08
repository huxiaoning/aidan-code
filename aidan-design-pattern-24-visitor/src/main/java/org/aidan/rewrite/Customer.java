package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 上午10:57
 * @描述: 各种客户的父类
 */
public abstract class Customer {

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String name;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(CustomerVisitor visitor);
}
