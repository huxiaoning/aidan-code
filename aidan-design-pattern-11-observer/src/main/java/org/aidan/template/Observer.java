package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:22
 * @描述: 观者者接口, 定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 */
public interface Observer {

    /**
     * 更新接口
     *
     * @param subject
     */
    void update(Subject subject);
}
