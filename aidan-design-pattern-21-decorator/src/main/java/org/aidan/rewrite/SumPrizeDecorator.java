package org.aidan.rewrite;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:14
 * @描述: 装饰器对象，计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {
    /**
     * 构造器
     *
     * @param c 被装饰的组件对象c
     */
    public SumPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 1 先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 2 然后计算累计奖金，其实应该按人员去获得累计的业务额，然后再*0.1%
        // 简单演示一下，假定大家的累计业务额都是1000000
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金" + prize);
        return money + prize;
    }
}
