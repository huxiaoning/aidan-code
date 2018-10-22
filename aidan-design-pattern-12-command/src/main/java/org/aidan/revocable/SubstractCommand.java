package org.aidan.revocable;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午5:00
 * @描述: 减法操作命令实现
 */
public class SubstractCommand implements Command {

    /**
     * 持有命令对象
     */
    private OperationApi operation;

    /**
     * 要加上的数据
     */
    private int opeNum;


    /**
     * 构造器,传入具体执行计算的对象
     *
     * @param operation
     */
    public SubstractCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.substract(opeNum);
    }

    @Override
    public void undo() {
        this.operation.add(opeNum);
    }
}
