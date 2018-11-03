package org.aidan.unshare;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午3:01
 * @描述: 享元工厂，通常实现成为单例
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = null;

    private FlyweightFactory() {

    }

    public static FlyweightFactory getInstance() {
        if (factory == null) {
            synchronized (FlyweightFactory.class) {
                factory = new FlyweightFactory();
            }
        }
        return factory;
    }

    /**
     * 缓存多个享元对象
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    /**
     * 获取key对应的享元对象
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }
}
