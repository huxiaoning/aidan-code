package org.aidan.deformation;

/**
 * 水质观察者接口定义
 */
public interface WatcherObserver {

    /**
     * 被通知的方法
     *
     * @param subject
     */
    void update(WaterQualitySubject subject);

    /**
     * 设置观察人员的职务
     *
     * @param job
     */
    void setJob(String job);

    /**
     * 获取观察人员的职务
     *
     * @return
     */
    String getJob();
}
