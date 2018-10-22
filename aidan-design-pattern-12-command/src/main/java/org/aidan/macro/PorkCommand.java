package org.aidan.macro;

/**
 * @author Aidan
 * @创建时间：2018/10/22 下午5:57
 * @描述: 命令对象，蒜泥白肉
 */
public class PorkCommand implements Command {

    /**
     * 持有具体做菜的厨师对象
     */
    private CookApi cookApi = null;

    @Override
    public void execute() {
        this.cookApi.cook("蒜泥白肉");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }
}
