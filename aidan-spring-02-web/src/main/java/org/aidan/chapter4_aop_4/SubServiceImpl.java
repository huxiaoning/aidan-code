package org.aidan.chapter4_aop_4;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午4:43
 * @描述: SubServiceImpl
 */
@Component
public class SubServiceImpl implements SubService {
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
