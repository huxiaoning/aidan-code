package org.aidan.revocable;

/**
 * @author Aidan
 * @创建时间：2018/10/20 下午5:16
 * @描述: 可撤销的操作 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Operation operation = new Operation();

        AddCommand addCommand = new AddCommand(operation, 5);
        SubstractCommand substractCommand = new SubstractCommand(operation, 3);


        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubstractCommand(substractCommand);


        // 按下加号按钮
        calculator.addPressed();
        System.out.println("一次加法运算的结果为：" + operation.getResult());

        // 按下减号
        calculator.substractPressed();
        System.out.println("一次减法运算的结果为:" + operation.getResult());

        // 按下撤销按钮
        calculator.undoPressed();
        System.out.println("撤销一次后的结果为:" + operation.getResult());

        // 按下撤销按钮
        calculator.undoPressed();
        System.out.println("再撤销一次后的结果为:" + operation.getResult());

        // 按下恢复按钮
        calculator.redoPressed();
        System.out.println("恢复一次后的结果为:" + operation.getResult());

        // 按下恢复按钮
        calculator.redoPressed();
        System.out.println("再恢复一次后的结果为:" + operation.getResult());


    }
}
