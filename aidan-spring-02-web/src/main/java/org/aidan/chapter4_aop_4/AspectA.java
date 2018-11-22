package org.aidan.chapter4_aop_4;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午4:22
 * @描述: AspectA
 */
public class AspectA {

    public void before(int a, int b) {
        System.out.println("AspectA before();并获取到参数a = " + a + ",b = " + b);
    }

    public void afterReturning(int a, int b) {
        System.out.println("AspectA afterReturning();并获取到参数a = " + a + ",b = " + b);
    }

    public int around(ProceedingJoinPoint jp, int a, int b) {
        int result = 0;
        try {
            result = (int) jp.proceed();
            System.out.println("AspectA around();并获取到参数a = " + a + ",b = " + b + ",结果result = " + result);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }
}
