package org.aidan.parent;


/**
 * @author Aidan
 * @创建时间：2018/10/26 上午11:28
 * @描述: 用模式重写示例 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Component root = new Composite("服装");

        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");


        root.addChildren(c1);
        root.addChildren(c2);

        c1.addChildren(leaf1);
        c1.addChildren(leaf2);

        c2.addChildren(leaf3);
        c2.addChildren(leaf4);

        // 输出整棵树
        root.printStruct("");

        System.out.println("----------------------删除一个男装节点----------------------");

        root.removeChildren(c1);

        // 再次输出整棵树
        root.printStruct("");

    }
}
