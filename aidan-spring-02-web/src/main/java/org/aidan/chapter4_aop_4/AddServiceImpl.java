package org.aidan.chapter4_aop_4;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午4:19
 * @描述: AddServiceImpl
 */
@Component
public class AddServiceImpl implements AddService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
