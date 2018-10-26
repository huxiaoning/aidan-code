package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午4:52
 * @描述: 叶子对象
 */
public class Leaf {

    /**
     * 叶子节点的名称
     */
    private String name;

    /**
     * 构造器 传入叶子对象的名字
     *
     * @param name
     */
    public Leaf(String name) {
        this.name = name;
    }

    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
