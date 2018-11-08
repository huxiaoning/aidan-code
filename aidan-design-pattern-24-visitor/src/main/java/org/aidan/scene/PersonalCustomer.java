package org.aidan.scene;

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

    /**
     * 客户提交服务请求的方法，示意一下
     */
    @Override
    public void serviceRequest() {
        System.out.println("客户" + super.getName() + "提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对个人客户" + super.getName() + "进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对个人客户" + super.getName() + "进行价值分析");
    }


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
    public String toString() {
        return "PersonalCustomer{" +
                "telephone='" + telephone + '\'' +
                ", age=" + age +
                '}';
    }
}
