package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 上午11:06
 * @描述: 个人客户
 */
public class PersonalCustomer extends Customer {

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 年龄
     */
    private int age;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void accept(CustomerVisitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
