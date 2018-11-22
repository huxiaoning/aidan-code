package org.aidan.data;

import org.aidan.entity.Spitter;

/**
 * @author Aidan
 * @创建时间：2018/11/14 下午5:32
 * @描述: SpittlerRepository
 */
public interface SpitterRepository {

    /**
     * 保存
     *
     * @param spittler
     * @return
     */
    Spitter save(Spitter spittler);

    Spitter findByUserName(String username);
}
