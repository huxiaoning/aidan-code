package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/6 下午1:52
 * @描述: 使用职责链
 */
public class Client {

    public static void main(String[] args) {
        // 先要组装职责链
        Handler h1 = new GeneralManager();
        Handler h2 = new DepManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        // 开始测试
        String ret1 = h3.handleFeeRequest("小李", 300);
        System.out.println("ret1 = " + ret1);
        String ret2 = h3.handleFeeRequest("小张", 300);
        System.out.println("ret2 = " + ret2);

        String ret3 = h3.handleFeeRequest("小李", 600);
        System.out.println("ret3 = " + ret3);
        String ret4 = h3.handleFeeRequest("小张", 600);
        System.out.println("ret4 = " + ret4);

        String ret5 = h3.handleFeeRequest("小李", 1200);
        System.out.println("ret5 = " + ret5);
        String ret6 = h3.handleFeeRequest("小张", 1200);
        System.out.println("ret6 = " + ret6);
    }
}