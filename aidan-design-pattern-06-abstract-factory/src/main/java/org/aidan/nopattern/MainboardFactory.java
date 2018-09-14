package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/14 上午9:24
 * @描述: 创建主板的简单工厂
 */
public class MainboardFactory {

    /**
     * 创建主板接口对象的方法
     *
     * @param type (1 技嘉主板 2 微星主板)
     * @return
     */
    public static MainboardApi createMainboardApi(int type) {
        MainboardApi mainboardApi = null;
        if (type == 1) {
            mainboardApi = new GaMainboard(1156);
        } else if (type == 2) {
            mainboardApi = new MsiMainboard(939);
        }
        return mainboardApi;
    }
}
