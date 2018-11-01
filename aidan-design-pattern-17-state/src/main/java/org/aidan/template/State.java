package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/30 上午10:06
 * @描述: 封装与Context的一个特定状态相关的行为
 */
public interface State {

    /**
     * 状态对应的处理
     *
     * @param sampleParameter
     */
    void handle(String sampleParameter);
}
