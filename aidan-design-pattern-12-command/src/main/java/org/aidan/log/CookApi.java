package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午9:16
 * @描述: 厨师接口
 */
public interface CookApi {

    /**
     * 示意，做菜的方法
     *
     * @param tableNum 点菜的桌号
     * @param name     菜名
     */
    void cook(int tableNum, String name);
}
