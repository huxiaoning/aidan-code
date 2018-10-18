package org.aidan.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:20
 * @描述: 目录对象，它知道观察它的观察者，并提供注册和删除观察者的接口
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察都对象
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者对象
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
