package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/3 上午10:32
 * @描述: 抽象表达式
 */
public abstract class AbstractExpression {

    /**
     * 解释的操作
     *
     * @param ctx 上下文对象
     */
    public abstract void interpret(Context ctx);
}
