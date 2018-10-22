package org.aidan.revocable;

/**
 * 命令接口
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 撤销命令对应的操作
     */
    void undo();
}
