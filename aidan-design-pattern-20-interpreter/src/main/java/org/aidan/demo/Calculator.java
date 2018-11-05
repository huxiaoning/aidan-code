package org.aidan.demo;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午2:58
 * @描述: 解析器封装类
 */
public class Calculator {

    /**
     * 定义的表达式
     */
    private Expression expression;

    /**
     * 构造函数传参,并解析
     *
     * @param expStr
     */
    public Calculator(String expStr) {

        //定义一个堆栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<Expression>();

        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();

        //运算
        Expression left = null;

        Expression right = null;

        for (int i = 0; i < charArray.length; i++) {

            switch (charArray[i]) {

                case '+':
                    //加法
                    //加法结果放到堆栈中
                    left = stack.pop();

                    right = new VarExpression(String.valueOf(charArray[++i]));

                    stack.push(new AddExpression(left, right));

                    break;

                case '-':

                    left = stack.pop();

                    right = new VarExpression(String.valueOf(charArray[++i]));

                    stack.push(new SubExpression(left, right));

                    break;

                default:
                    //公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));

            }

        }
        //把运算结果抛出来
        this.expression = stack.pop();

    }

    /**
     * 开始运算
     *
     * @param var
     * @return
     */
    public int run(HashMap<String, Integer> var) {

        return this.expression.interpreter(var);

    }

}