package org.aidan.chapter4_aop_3_4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:45
 * @描述: AspectWalk
 */
@Aspect
@Component
public class AspectWalk {

    @DeclareParents(value = "org.aidan.chapter4_aop_3_4.DemoService+", defaultImpl = DefaultWalk.class)
    public static Walk walk;
}
