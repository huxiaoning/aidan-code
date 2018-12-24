package org.aidan.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/26 2:08 PM
 * @描述: BaseDao
 */
public interface BaseDao<T> {

    /**
     * 查询全部记录
     *
     * @return
     */
    List<T> findAll();

    /**
     * 根据ID查询实体
     *
     * @param id
     * @return
     */
    T find(Serializable id);

    /**
     * 保存单个实体
     *
     * @param entity
     * @return
     */
    T save(T entity);
}
