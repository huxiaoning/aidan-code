package org.aidan.data;

import org.aidan.entity.Spitter;
import org.springframework.stereotype.Repository;

/**
 * @author Aidan
 * @创建时间：2018/11/21 5:19 PM
 * @描述: SpitterRepositoryImpl
 */
@Repository
public class SpitterRepositoryImpl implements SpitterRepository {
    @Override
    public Spitter save(Spitter spittler) {
        return null;
    }

    @Override
    public Spitter findByUserName(String username) {
        return new Spitter(24L, "thinkgem", "thinkgem", "thinkgem", "thinkgem");
    }
}
