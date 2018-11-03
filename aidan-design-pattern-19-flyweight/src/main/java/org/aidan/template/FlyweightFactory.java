package org.aidan.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午2:25
 * @描述: 享元工厂
 */
public class FlyweightFactory {

    /**
     * 缓存多个Flyweight对象,这里只是示意一下
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    /**
     * 获取key对象的享元对象
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        // 1 先从缓存中查找,是否存在key对应的
        Flyweight f = fsMap.get(key);
        // 2 如果存在，就返回相对应的Flyweight对象
        if (f != null) {
            return f;
        }
        // 3 如果不存在：创建一个新的Flyweight对象，放入缓存并返回此对象
        f = new ConcreteFlyweight(key);
        fsMap.put(key, f);
        return f;
    }
}
