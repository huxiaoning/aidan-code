package org.aidan.chapter4_aop_3_4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:37
 * @描述: AspectA 一个正常的切面
 */
@Aspect
@Component
public class AspectA {

    @Pointcut("execution(* org.aidan.chapter4_aop_3_4.DemoService.hello(String)) && args(name)")
    public void hello(String name) {
    }

    @After("hello(name)")
    public void after(String name) {
        System.out.println("AspectA拿到参数name = " + name);
    }

    @Around("hello(name)")
    public Object after(ProceedingJoinPoint jp, String name) {
        Object proceed = null;
        try {
            proceed = jp.proceed();
            System.out.println("AspectA拿到返回值 = " + proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return proceed;
    }
}
