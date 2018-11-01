package org.aidan.sample1;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:47
 * @描述: 目标对象作为被观察者
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象，即订阅者
     */
    private List<Observer> readers = new ArrayList<>();

    /**
     * 注册，报纸的读者需要向报社订阅
     *
     * @param reader
     */
    public void attach(Observer reader) {
        readers.add(reader);
    }

    /**
     * 报纸的读者可以取消订阅
     *
     * @param reader
     */
    public void detach(Observer reader) {
        readers.remove(reader);
    }

    /**
     * 每期报纸印刷出来后，就要迅速主动地被送到读者手中
     * 相当于通知读者，让他们知道
     */
    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }
}
