package org.aidan.nopattern;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午4:56
 * @描述: 组合对象，可以包含其他组合对象或叶子对象
 */
public class Composite {

    /**
     * 用来记录包含的其他组合对象
     */
    private Collection<Composite> childComposite = new ArrayList<>();

    /**
     * 用来记录包含的其他叶子对象
     */
    private Collection<Leaf> childLeaf = new ArrayList<>();

    /**
     * 组合对象的名字
     */
    private String name;

    /**
     * 构造方法，传入组合对象的名字
     *
     * @param name
     */
    public Composite(String name) {
        this.name = name;
    }

    /**
     * 向组全对象加入被它包含的其他组合对象
     *
     * @param composite
     */
    public void addComposite(Composite composite) {
        this.childComposite.add(composite);
    }

    /**
     * 向组合对象加入被它包含的其他叶子对象
     *
     * @param leaf
     */
    public void addLeaf(Leaf leaf) {
        this.childLeaf.add(leaf);
    }

    /**
     * 输出组合对象自身的结构
     *
     * @param preStr
     */
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);

        preStr += "  ";

        for (Leaf leaf : this.childLeaf) {
            leaf.printStruct(preStr);
        }

        for (Composite composite : this.childComposite) {
            composite.printStruct(preStr);
        }
    }
}
