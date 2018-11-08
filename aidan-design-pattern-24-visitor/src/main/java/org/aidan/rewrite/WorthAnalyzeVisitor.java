package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午4:26
 * @描述: 具体的访问者，实现对客户的价值分析
 */
public class WorthAnalyzeVisitor implements CustomerVisitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        // 根据购买金额的大小，购买的产品和服务的多少，购买频率等进行分析
        // 企业客户的标准会比个人客户高
        System.out.println("现在对企业客户" + ec.getName() + "进行价值分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        // 根据购买金额的大小，购买的产品和服务的多少，购买频率等进行分析
        // 企业客户的标准会比个人客户高
        System.out.println("现在对个人客户" + pc.getName() + "进行价值分析");
    }
}
