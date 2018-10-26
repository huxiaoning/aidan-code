package org.aidan.rewrite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/26 上午11:20
 * @描述: 组合对象
 */
public class Composite extends Componet {

    private List<Componet> childComponets = null;

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

    @Override
    public void addChild(Componet child) {
        if (childComponets == null) {
            childComponets = new ArrayList<>();
        }
        childComponets.add(child);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);

        preStr += "  ";


        for (Componet componet : this.childComponets) {
            componet.printStruct(preStr);
        }
    }
}
