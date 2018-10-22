package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:07
 * @描述: 命令接口，声明执行的操作
 */
public interface Command {

    /**
     * 执行命令相应的操作
     */
    void execute();


    void setCookApi(CookApi cookApi);
}
