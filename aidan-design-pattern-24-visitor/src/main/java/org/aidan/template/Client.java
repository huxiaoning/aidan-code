package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:18
 * @描述: 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        // 创建 ObjectStructure
        ObjectStructure os = new ObjectStructure();

        // 创建要加入对象结构的元素
        Element eleA = new ConcreteElementA();
        Element eleB = new ConcreteElementB();

        // 把元素中入对象结构
        os.addElement(eleA);
        os.addElement(eleB);

        // 创建访问者
        Visitor visitor = new ConcreteVisitor1();

        // 调用业务处理方法
        os.handleRequest(visitor);

    }
}
