package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:41
 * @描述: 具体的访问者，实现客户提出服务请求的功能
 */
public class ServiceRequestVisitor implements CustomerVisitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println(ec.getName() + "企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("客户" + pc.getName() + "提出服务请求");
    }
}
