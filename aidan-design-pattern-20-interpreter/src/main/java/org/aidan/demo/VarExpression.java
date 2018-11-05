package org.aidan.demo;

import java.util.HashMap;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:52
 * @描述: 变量解析器
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
