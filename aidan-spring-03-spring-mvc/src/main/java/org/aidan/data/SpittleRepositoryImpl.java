package org.aidan.data;

import org.aidan.entity.Spitte;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/11/14 上午10:36
 * @描述: SpittleRepositoryImpl
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spitte> findSpittles(long max, int count) {
        List<Spitte> spittleList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittleList.add(new Spitte("Spittle" + i, new Date()));
        }
        return spittleList;
    }

    @Override
    public Spitte findOne(Long id) {
        return new Spitte("Hello", new Date());
    }
}
