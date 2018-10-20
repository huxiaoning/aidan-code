package org.aidan.deformation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/19 上午10:04
 * @描述: 水质监察的目标对象
 */
public abstract class WaterQualitySubject {

    /**
     * 用来保存注册的观察都对象
     */
    protected List<WatcherObserver> observers = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void attach(WatcherObserver observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void detach(WatcherObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     *
     * @return
     */
    public abstract int getPolluteLevel();
}
