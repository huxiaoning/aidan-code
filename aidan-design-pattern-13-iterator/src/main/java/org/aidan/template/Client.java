package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/24 下午5:20
 * @描述: 迭代器模式 模板 客户端测试类
 */
public class Client {


    /**
     * 示意方法，使用迭代器的功能
     * 这里示意使用迭代器来迭代聚合对象
     */
    public void someOperation() {
        String[] names = new String[]{"张三", "李四", "王五"};

        Aggregate aggregate = new ConcreteAggregate(names);

        Iterator iterator = aggregate.createIterator();

        iterator.first();

        while (!iterator.isDone()) {
            Object obj = iterator.currentItem();
            System.out.println("the obj = " + obj);
            iterator.next();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }
}
