package org.aidan.demo;

import java.util.HashMap;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:55
 * @描述: 加法解析器
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
