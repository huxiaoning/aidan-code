package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午3:51
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Prize p = new Prize();
        double zs = p.calcPrize("张三", null, null);
        System.out.println("===============张三应得奖金：" + zs);

        double ls = p.calcPrize("李四", null, null);
        System.out.println("===============李四应得奖金：" + ls);

        double ww = p.calcPrize("王五", null, null);
        System.out.println("===============王五应得奖金：" + ww);
    }
}
