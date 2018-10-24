package org.aidan.log;

/**
 * @author Aidan
 * @创建时间：2018/10/23 上午9:21
 * @描述: 命令对象，北京烤鸭
 */
public class DuckCommand implements Command {

    /**
     * 持有做菜的厨师对象
     */
    private CookApi cookApi = null;

    /**
     * 点菜的桌号
     */
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum, "北京烤鸭");
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public int getTableNum() {
        return this.tableNum;
    }
}
