package org.aidan.chapter4_aop;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/11 下午2:21
 * @描述: MusicPerformance
 */
@Component
public class MusicPerformance implements Performance {

    @Override
    public void perform() {
        System.out.println("MusicPerformance perform()");
    }
}
