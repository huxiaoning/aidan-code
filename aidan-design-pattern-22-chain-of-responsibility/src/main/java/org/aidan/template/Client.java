package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/6 上午10:48
 * @描述: 职责链的客户端，这里只是个示意
 */
public class Client {

    public static void main(String[] args) {
        // 先组装职责链
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);

        // 然后提交请求
        h1.handleRequest();
    }
}
