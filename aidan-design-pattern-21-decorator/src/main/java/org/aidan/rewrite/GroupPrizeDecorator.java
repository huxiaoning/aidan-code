package org.aidan.rewrite;

import org.aidan.nopattern.TempDB;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:18
 * @描述: 装饰器对象，计算当月团队业务奖金
 */
public class GroupPrizeDecorator extends Decorator {
    /**
     * 构造器
     *
     * @param c 被装饰的组件对象c
     */
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 1 先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 2 然后计算当月团队业务奖金，先计算出团队的总业务额，然后再*1%
        // 假设都是一个团队的
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return money + prize;
    }
}
