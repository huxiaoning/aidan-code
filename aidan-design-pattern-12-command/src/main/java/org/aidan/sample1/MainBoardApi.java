package org.aidan.sample1;

/**
 * 主板接口
 */
public interface MainBoardApi {

    /**
     * 主板具有能开机的功能
     */
    void open();

    /**
     * 主板具有重启的功能
     */
    void reset();
}
