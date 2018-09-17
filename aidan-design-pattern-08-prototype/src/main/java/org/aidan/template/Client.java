package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/9/17 下午4:07
 * @描述: 使用原型的客户端
 */
public class Client {

    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    /**
     * 构造器,传入需要使用的原型接口对象
     *
     * @param prototype 需要使用的原型接口对象
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    /**
     * 示意方法，执行某个功能操作
     */
    public void operation() {
        // 需要创建原型接口的对象
        Prototype newPrototype = prototype.clone();
    }

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1();
        Client client = new Client(prototype);
        client.operation();
    }
}
