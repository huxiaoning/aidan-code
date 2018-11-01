package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午4:33
 * @描述: 命令模式示例代码客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        GigaMainBoard gigaMainBoard = new GigaMainBoard();

        OpenCommand openCommand = new OpenCommand(gigaMainBoard);

        Box box = new Box();
        box.setOpenCommand(openCommand);

        box.openButtonPressed();

        System.out.println("------------");
        ResetCommand resetCommand = new ResetCommand(gigaMainBoard);
        box.setResetCommand(resetCommand);

        box.resetButtonPressed();

    }
}
