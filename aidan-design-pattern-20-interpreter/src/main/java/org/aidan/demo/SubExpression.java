package org.aidan.demo;

import java.util.HashMap;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:56
 * @描述: 减法解析器
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
