package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/26 上午11:08
 * @描述: 组合模式 模板代码 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Componet root = new Composite();

        Componet c1 = new Composite();
        Componet c2 = new Composite();

        Componet leaf1 = new Leaf();
        Componet leaf2 = new Leaf();
        Componet leaf3 = new Leaf();

        root.addChild(c1);
        root.addChild(c2);

        root.addChild(leaf1);

        c1.addChild(leaf2);
        c2.addChild(leaf3);

        Componet o = root.getChildren(1);

        System.out.println(o == c2);

    }
}
