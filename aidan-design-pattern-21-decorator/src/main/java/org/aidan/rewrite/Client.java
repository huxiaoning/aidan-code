package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午9:23
 * @描述: 使用装饰模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Component c = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(c);
        Decorator d2 = new SumPrizeDecorator(d1);

        // 注意：这里只需要使用最后组合好的对象调用业务方法即可，会依次调用回去
        double zs = d2.calcPrize("张三", null, null);
        System.out.println("====================张三应得奖金" + zs);

        double ls = d2.calcPrize("李四", null, null);
        System.out.println("====================李四应得奖金" + ls);

        Decorator d3 = new GroupPrizeDecorator(d2);
        double ww = d3.calcPrize("王五", null, null);
        System.out.println("====================王五应得奖金" + ww);
    }
}
