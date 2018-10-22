package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:55
 * @描述: 命令对象，北京烤鸭
 */
public class DuckCommand implements Command {
    /**
     * 持有具体做菜的厨师对象
     */
    private CookApi cookApi = null;

    @Override
    public void execute() {
        this.cookApi.cook("北京烤鸭");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
}
