package org.aidan.java;


/**
 * @author Aidan
 * @创建时间：2018/10/18 下午4:41
 * @描述: java中的观察者模式客户端测试类
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
        newsPaper.addObserver(reader1);
        newsPaper.addObserver(reader2);
        newsPaper.addObserver(reader3);

        // 要出报纸啦
        newsPaper.setContent("本期内容是观察者模式");
    }
}
