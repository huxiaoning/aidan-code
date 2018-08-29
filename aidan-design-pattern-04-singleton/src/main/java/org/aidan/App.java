package org.aidan;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();


        /**
         * 使用单例对象
         */
        singleton.setData("1111");
        System.out.println(singleton.getData());
        Singleton singleton1 = Singleton.getInstance();

        /**
         * 第一次与第二次获取的对象是同一对象
         */
        System.out.println(singleton == singleton1);
    }
}
