package org.aidan.scene;

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

    /**
     * 客户提交服务请求的方法，示意一下
     */
    public abstract void serviceRequest();

    /**
     * 客户对公司产品的偏好分析，示意一下
     */
    public abstract void predilectionAnalyze();

    /**
     * 客户价值分析，示意一下
     */
    public abstract void worthAnalyze();

    /**
     * get set
     */

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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
