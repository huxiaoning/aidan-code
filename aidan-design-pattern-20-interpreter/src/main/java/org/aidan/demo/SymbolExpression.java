package org.aidan.demo;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:54
 * @描述: 抽象运算符号解析器
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
