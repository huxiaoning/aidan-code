package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午11:12
 * @描述: 具体的职责对象 - 项目经理
 */
public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            // 项目经理的权限比较小，只能在500以内
            // 为了测试，简单点，只同意上李的
            if ("小李".equals(user)) {
                str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            // 超过500，传给下一个级别更高的人处理
            if (successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
