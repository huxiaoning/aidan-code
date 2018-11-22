package org.aidan.chapter4_aop_3_3_paramter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:05
 * @描述: AopParameterProcess
 */
@Aspect
@Component
public class AopParameterProcess {

    @Pointcut("execution(* org.aidan.chapter4_aop_3_3_paramter.DemoService.hello(String)) && args(name)")
    public void hello(String name) {
    }

    @Before("hello(name)")
    public void before(String name) {
        System.out.println("在AOP @Before中拿到参数name = " + name);
    }

    @Around("hello(name)")
    public void around(ProceedingJoinPoint jp, String name) {
        System.out.println("在AOP @Around中拿到参数name = " + name);
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

}
