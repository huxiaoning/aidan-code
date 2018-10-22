package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:09
 * @描述: 命令对象，绿豆排骨煲
 */
public class ChopCommand implements Command {

    /**
     * 持有具体做菜的厨师对象
     */
    private CookApi cookApi = null;

    @Override
    public void execute() {
        this.cookApi.cook("绿豆排骨煲");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
}
