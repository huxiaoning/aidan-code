package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午5:09
 * @描述: 不使用模式的客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("服装");

        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");

        Leaf leaf1 = new Leaf("衬衣");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");


        root.addComposite(c1);
        root.addComposite(c2);

        c1.addLeaf(leaf1);
        c1.addLeaf(leaf2);

        c2.addLeaf(leaf3);
        c2.addLeaf(leaf4);

        root.printStruct("");
    }
}
