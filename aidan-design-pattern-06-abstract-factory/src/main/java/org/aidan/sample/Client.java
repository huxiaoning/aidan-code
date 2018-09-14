package org.aidan.sample;

/**
 * @author Aidan
 * @创建时间：2018/9/14 下午5:49
 * @描述: 客户端类
 */
public class Client {
    public static void main(String[] args) {
        // 创建装机工程师对象
        ComputerEngineer computerEngineer = new ComputerEngineer();
        // 客户选择并创建需要使用的装机方案
        AbstractFactory schema = new Schema1();
        // 告诉装机工程师自已选择的装机方案，让装机工程师组装电脑
        computerEngineer.makeComputer(schema);
    }
}
