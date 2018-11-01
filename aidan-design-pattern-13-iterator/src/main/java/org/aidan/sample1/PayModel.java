package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/25 上午10:06
 * @描述: 工资描述模型对象
 */
public class PayModel {

    /**
     * 支付工资的人员
     */
    private String userName;

    /**
     * 支付工资的数额
     */
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "userName='" + userName + '\'' +
                ", pay=" + pay +
                '}';
    }
}
