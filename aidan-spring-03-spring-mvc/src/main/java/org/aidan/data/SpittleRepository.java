package org.aidan.data;

import org.aidan.entity.Spitte;

import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/13 上午9:19
 * @描述: SpittleRepository
 */
public interface SpittleRepository {

    /**
     * 获得最新的20个Spittle对象：findSpittles(Long.MAX_VALUE,20）
     *
     * @param max   代表所返回的Spittle中 Spittle ID属性最大的值
     * @param count 表示要返回多少个对象
     * @return
     */
    List<Spitte> findSpittles(long max, int count);

    /**
     * 根据id查询Spittle
     *
     * @param id
     * @return
     */
    Spitte findOne(Long id);
}
