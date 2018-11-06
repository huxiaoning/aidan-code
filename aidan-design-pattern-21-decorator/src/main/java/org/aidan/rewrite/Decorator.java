package org.aidan.rewrite;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:06
 * @描述: 装饰器的接口，需要和被装饰的对象实现相同的接口
 */
public abstract class Decorator extends Component {

    /**
     * 持有被装饰的组件对象
     */
    private Component c;

    /**
     * 构造器
     *
     * @param c 被装饰的组件对象c
     */
    public Decorator(Component c) {
        this.c = c;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return c.calcPrize(user, begin, end);
    }
}
