package org.aidan.log;

import java.io.Serializable;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午9:13
 * @描述: 命令接口，声明接口的操作
 */
public interface Command extends Serializable {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 设置命令的接收者
     *
     * @param cookApi
     */
    void setCookApi(CookApi cookApi);

    /**
     * 返回发起请求的桌号
     *
     * @return
     */
    int getTableNum();
}
