package org.aidan.demo;

import java.util.HashMap;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:51
 * @描述: 抽象表达式类
 */
public abstract class Expression {

    /**
     * 解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
     *
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
