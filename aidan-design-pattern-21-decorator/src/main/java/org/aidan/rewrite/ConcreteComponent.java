package org.aidan.rewrite;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:04
 * @描述: 基本实现计算奖金的类，也是被装饰器装饰的对象
 */
public class ConcreteComponent extends Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 只是一个默认实现，默认没有奖金
        return 0;
    }
}
