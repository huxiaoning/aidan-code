package org.aidan.dao.base.impl;

import org.aidan.dao.base.BaseDao;
import org.aidan.util.BeanUtil;
import org.aidan.util.JdbcUtil;
import org.aidan.util.UuidUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/26 2:08 PM
 * @描述: BaseDaoImpl
 */
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

    private String talbeName;

    private Class<T> clazz;

    public BaseDaoImpl() {
        /** clazz属性赋值 */
        Class<?> c = getClass();
        Type type = c.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            this.clazz = (Class<T>) parameterizedType[0];
            /** tableName属性赋值 TODO 表名也没有做格式映射 */
            this.talbeName = this.clazz.getSimpleName().toLowerCase();
        }
    }

    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public List<T> findAll() {
        String sql = "SELECT * FROM " + talbeName;
        RowMapper<T> rowMapper = new RowMapper<T>() {
            @Override
            public T mapRow(ResultSet rs, int rowNum) throws SQLException {
                return JdbcUtil.rsToObject(clazz, rs);
            }
        };
        return jdbcOperations.query(sql, rowMapper);
    }

    @Override
    public T find(Serializable id) {
        String sql = "SELECT * FROM " + talbeName + " WHERE id = ?";
        RowMapper<T> rowMapper = new RowMapper<T>() {
            @Override
            public T mapRow(ResultSet rs, int rowNum) throws SQLException {
                return JdbcUtil.rsToObject(clazz, rs);
            }
        };
        return jdbcOperations.queryForObject(sql, rowMapper, id);
    }

    @Override
    public T save(T entity) {
        try {
            /** 生成ID */
            BeanUtil.setProperty(entity, "id", UuidUtil.generateUuid());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Field[] fields = clazz.getDeclaredFields();
        List<String> columnNameList = new ArrayList<>();
        List<Object> columnValueList = new ArrayList<>();
        for (Field field : fields) {
            String name = field.getName();
            columnNameList.add(JdbcUtil.field2Column(name));
            try {
                field.setAccessible(true);
                Object value = field.get(entity);
                columnValueList.add(value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        int len = columnNameList.size();
        /** 串sql列名 */
        String[] columnNameArray = columnNameList.toArray(new String[len]);
        String columnNameStr = StringUtils.join(columnNameArray, ",");

        /** 串sql值占位符:“?” */
        String[] valueSeatArray = new String[len];
        for (int i = 0; i < len; i++) {
            valueSeatArray[i] = "?";
        }
        String valueSeatStr = StringUtils.join(valueSeatArray, ",");
        String sql = "INSERT INTO " + talbeName + "(" + columnNameStr + ") VALUES(" + valueSeatStr + ")";
        jdbcOperations.update(sql, columnValueList);
        return entity;
    }
}
