package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午11:08
 * @描述: 定义职责对象的接口
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     *
     * @param user 申请人
     * @param fee  申请的钱数
     * @return 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user, double fee);
}
