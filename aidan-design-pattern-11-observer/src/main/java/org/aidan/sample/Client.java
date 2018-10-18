package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午3:05
 * @描述: 观察者模式示例测试客户端类
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个报纸，作为被观察者
        NewsPaper newsPaper = new NewsPaper();

        // 创建阅读者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("张三");

        Reader reader2 = new Reader();
        reader2.setName("李四");

        Reader reader3 = new Reader();
        reader3.setName("王五");

        // 注册订阅者
        newsPaper.attach(reader1);
        newsPaper.attach(reader2);
        newsPaper.attach(reader3);

        // 要出报纸啦
        newsPaper.setContent("本期内容是观察者模式");
    }
}
