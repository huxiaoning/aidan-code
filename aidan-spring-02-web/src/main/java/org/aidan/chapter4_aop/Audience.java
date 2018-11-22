package org.aidan.chapter4_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 上午11:13
 * @描述: 观众
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* org.aidan.chapter4_aop.Performance.perform(..))")
    public void performance() {
    }

    /**
     * 表演之前
     */
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silence cell phones");
    }

    /**
     * 表演之前
     */
    @Before("performance()")
    public void takeSeats() {
        System.out.println("take seats");
    }

    /**
     * 表演之后
     */
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    /**
     * 表演失败之后
     */
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("demand a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        System.out.println("silence cell phones");
        System.out.println("take seats");
        try {
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("demand a refund");
            throwable.printStackTrace();
        }
    }
}
