package org.aidan.util;

import java.lang.reflect.Field;

/**
 * @author Aidan
 * @创建时间：2018/11/14 上午10:46
 * @描述: BeanUtil
 */
public class BeanUtil {

    public static void setProperty(final Object bean, final String name, final Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = bean.getClass();
        Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        declaredField.set(bean, value);
    }

    public static Object getProperty(final Object bean, final String name) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = bean.getClass();
        Field declaredField = clazz.getDeclaredField(name);
        declaredField.setAccessible(true);
        return declaredField.get(bean);
    }
}
