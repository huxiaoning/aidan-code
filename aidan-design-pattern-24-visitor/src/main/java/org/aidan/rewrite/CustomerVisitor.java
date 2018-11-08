package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:37
 * @描述: 客户访问者接口
 */
public interface CustomerVisitor {

    /**
     * 访问企业客户
     *
     * @param enterpriseCustomer 企业用户
     */
    void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);

    /**
     * 访问个人客户
     *
     * @param personalCustomer 个人用户
     */
    void visitPersonalCustomer(PersonalCustomer personalCustomer);
}
