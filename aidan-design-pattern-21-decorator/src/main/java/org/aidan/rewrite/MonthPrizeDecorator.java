package org.aidan.rewrite;

import org.aidan.nopattern.TempDB;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:09
 * @描述: 装饰器对象，计算当月业务奖金
 */
public class MonthPrizeDecorator extends Decorator {
    /**
     * 构造器
     *
     * @param c 被装饰的组件对象c
     */
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 1 先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 然后计算当月业务奖金，按人员和时间去获取当月业务额，然后再*3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "当月业务奖金" + prize);
        return money + prize;
    }
}
