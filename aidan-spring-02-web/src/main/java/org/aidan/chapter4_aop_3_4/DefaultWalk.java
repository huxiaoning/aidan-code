package org.aidan.chapter4_aop_3_4;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午3:47
 * @描述: DefaultWalk
 */
public class DefaultWalk implements Walk {
    @Override
    public void walk() {
        System.out.println("我是新增加的走路的功能");
    }
}
