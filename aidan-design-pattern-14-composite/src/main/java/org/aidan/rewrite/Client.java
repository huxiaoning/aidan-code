package org.aidan.rewrite;


/**
 * @author Aidan
 * @创建时间：2018/10/26 上午11:28
 * @描述: 用模式重写示例 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Componet root = new Composite("服装");

        Componet c1 = new Composite("男装");
        Componet c2 = new Composite("女装");

        Componet leaf1 = new Leaf("衬衣");
        Componet leaf2 = new Leaf("夹克");
        Componet leaf3 = new Leaf("裙子");
        Componet leaf4 = new Leaf("套装");


        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(leaf1);
        c1.addChild(leaf2);

        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}
