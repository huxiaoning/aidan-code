package org.aidan.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Aidan
 * @创建时间：2018/11/26 12:27 PM
 * @描述: JdbcUtil
 */
public class JdbcUtil {

    /**
     * 结果集映射成实体
     *
     * @param entityClass
     * @param rs
     * @param <T>
     * @return
     */
    public static <T> T rsToObject(Class<T> entityClass, ResultSet rs) {
        T entity = null;
        try {
            entity = entityClass.newInstance();
            Field[] declaredFields = entityClass.getDeclaredFields();
            for (Field field : declaredFields) {
                String fieldName = field.getName();
                // TODO 字段名没有做格式映射
                Object fieldValue = rs.getObject(fieldName);
                BeanUtil.setProperty(entity, fieldName, fieldValue);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return entity;
    }

    /**
     * 实体字段 转 数据库列 (驼峰转下划线)
     *
     * @param fieldName
     * @return
     */
    public static String field2Column(String fieldName) {
        char[] chars = fieldName.toCharArray();
        Map<Character, String> replaceMap = new HashMap<>();
        for (char c : chars) {
            int askC = CharUtil.char2Ask(c);
            if (askC >= CharUtil.A && askC <= CharUtil.Z) {
                String s = CharUtil.camel2Underline(c);
                replaceMap.put(c, s);
            }
        }
        Set<Map.Entry<Character, String>> entries = replaceMap.entrySet();
        Iterator<Map.Entry<Character, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<Character, String> entry = it.next();
            Character key = entry.getKey();
            String value = entry.getValue();
            fieldName = fieldName.replaceAll(key + "", value);
        }
        return fieldName;
    }


    public static void main(String[] args) {
        System.out.println(field2Column("birthDay"));
        int A = 'A';
        int a = 'a';
        int Z = 'Z';
        System.out.println(A);
        System.out.println(a);
        System.out.println(Z);
    }
}
