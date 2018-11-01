package org.aidan.sample1;

/**
 * 观察者，比如报纸的读者
 */
public interface Observer {

    /**
     * 被通知的方法
     * @param subject
     */
    void update(Subject subject);
}
