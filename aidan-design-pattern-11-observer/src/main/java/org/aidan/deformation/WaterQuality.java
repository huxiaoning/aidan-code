package org.aidan.deformation;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午2:17
 * @描述: 具体的水质监测对象
 */
public class WaterQuality extends WaterQualitySubject {

    /**
     * 染污的级别 0表示正常 1表示轻度污染 2表示中度污染 3表示高度污染
     */
    private int polluteLevel = 0;

    @Override
    public void notifyWatchers() {
        for (WatcherObserver watcher : observers) {
            if (this.polluteLevel >= 0) {
                if ("监测人员".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }

            if (this.polluteLevel >= 1) {
                if ("预警人员".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }

            if (this.polluteLevel >= 2) {
                if ("监测部门领导".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
        }
    }

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        /* 通知相应的观察者 */
        this.notifyWatchers();
    }
}
