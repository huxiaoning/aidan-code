package org.aidan;

/**
 * 在Java中一种更好的单例实现方式
 * Lazy initialization holder class模式
 */
public class Singleton {
    /**
     * 类级的内部类，也就是静态的成员式内部类,该内部类的实例与外部类的实例没有绑定关系
     * 而且只有被调用时才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    /**
     * 私有构造方法
     */
    private Singleton() {

    }

    /**
     * 公开获取单实例的方法
     */
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
