package org.aidan.revocable;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:56
 * @描述: 操作运算的实现类
 */
public class Operation implements OperationApi {

    /**
     * 记录运算的结构
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }
}
