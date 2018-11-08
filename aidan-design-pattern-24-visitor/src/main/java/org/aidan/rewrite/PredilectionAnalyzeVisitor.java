package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:45
 * @描述: 具体的访问者，实现对客户的偏好分析
 */
public class PredilectionAnalyzeVisitor implements CustomerVisitor {
    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        // 根据以往购买历史，潜在购买意向
        // 以及客户所在行业的发展趋势，客户的发展预期等的分析
        System.out.println("现在对企业客户" + ec.getName() + "进行产品偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        // 根据以往购买历史，潜在购买意向
        // 以及客户所在行业的发展趋势，客户的发展预期等的分析
        System.out.println("现在对个人客户" + pc.getName() + "进行产品偏好分析");
    }
}
