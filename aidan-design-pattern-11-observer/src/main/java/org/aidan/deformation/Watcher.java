package org.aidan.deformation;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午2:07
 * @描述: 具体的观察者实现
 */
public class Watcher implements WatcherObserver {

    /**
     * 职务
     */
    private String job;

    @Override
    public void update(WaterQualitySubject subject) {
        System.out.println(job + "获取通知，当前的染污级别为" + subject.getPolluteLevel());
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getJob() {
        return this.job;
    }
}
