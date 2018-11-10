package org.aidan.chapter3_2_conditional_bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午4:09
 * @描述: MagicExistsCondition
 */
public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        boolean containsProperty = environment.containsProperty("configRootPath");
        System.out.println(environment.getProperty("configRootPath"));
        return containsProperty;
    }
}
