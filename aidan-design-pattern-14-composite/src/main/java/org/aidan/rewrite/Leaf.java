package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/10/26 上午11:21
 * @描述: 叶子对象
 */
public class Leaf extends Componet {

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

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
