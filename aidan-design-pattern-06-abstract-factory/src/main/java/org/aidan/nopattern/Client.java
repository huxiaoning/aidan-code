package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/9/14 上午10:32
 * @描述: 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建装机工程师对象
        ComputerEngineer engineer = new ComputerEngineer();
        // 告诉装机工程师自已选择的配件,让装机工程师组装电脑
        engineer.makeComputer(1, 1);
    }
}
