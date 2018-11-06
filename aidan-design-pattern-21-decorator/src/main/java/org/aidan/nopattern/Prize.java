package org.aidan.nopattern;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午3:36
 * @描述: 计算奖金的对象
 */
public class Prize {

    /**
     * 计算某人在某段时间内的奖金，有些参数在演示中并不会使用
     * 但是在实际业务实现上是会用的，为了表示这是个具体的业务方法
     * 因此这些参数被保留了
     *
     * @param user  被计算奖金的人员
     * @param begin 计算奖金的开始时间
     * @param end   计算奖金的结束时间
     * @return 某人在某段时间内的奖金
     */
    public double calcPrize(String user, Date begin, Date end) {
        double prize = 0.0D;
        prize = this.monthPrize(user, begin, end);
        prize += this.sumPrize(user, begin, end);
        if (this.isManager(user)) {
            prize += this.groupPrize(user, begin, end);
        }
        return prize;
    }


    private double monthPrize(String user, Date begin, Date end) {
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "当月业务奖金" + prize);
        return prize;
    }


    public double sumPrize(String user, Date begin, Date end) {
        // 假定大家的累计业务都是1000000
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金" + prize);
        return prize;
    }

    private boolean isManager(String user) {
        if ("王五".equals(user)) {
            return true;
        }
        return false;
    }

    public double groupPrize(String user, Date begin, Date end) {
        // 假设都是一个团队的
        double group = 0.0D;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return prize;
    }
}
