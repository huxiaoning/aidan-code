package org.aidan;

/**
 * 懒汉式单例实现示例
 */
public class Singleton {

    /**
     * 定义一个变量来存储创建好的类实例
     */
    private static volatile Singleton uniqueInstance = null;


    /**
     * 私有化构造方法,可以在内部控制创建实例的数目
     */
    private Singleton() {

    }

    /**
     * 定义静态方法来让外部获取本类的实例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


    /**
     * ---------------单例对象自已的成员-------------------
     */

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
