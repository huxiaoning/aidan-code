package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午11:28
 * @描述: 具体的职责对象 - 总经理
 */
public class GeneralManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("小李".equals(user)) {
                str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            if (successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
