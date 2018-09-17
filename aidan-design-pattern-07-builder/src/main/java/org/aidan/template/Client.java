package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/17 上午9:58
 * @描述: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.consttruct();
    }
}
