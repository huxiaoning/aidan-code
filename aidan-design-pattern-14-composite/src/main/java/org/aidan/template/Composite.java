package org.aidan.template;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午5:35
 * @描述: 组合对象，通常需要存储子对象,定义有子部件的部件行为
 * 并实现在Component里面定义的与子部件有关的操作
 */
public class Composite extends Componet {

    /**
     * 用来存储组合对象中包含的子组件对象
     */
    private List<Componet> childComponets = null;


    @Override
    public void someOperation() {
        if (childComponets == null || childComponets.size() == 0) {
            return;
        }
        for (Componet child : this.childComponets) {
            // 递归地进行子组件相应的方法的调用
            child.someOperation();
        }
    }


    @Override
    public void addChild(Componet child) {
        if (childComponets == null) {
            childComponets = new ArrayList<>();
        }
        childComponets.add(child);
    }

    @Override
    public void removeChild(Componet child) {
        if (childComponets == null) {
            return;
        }
        childComponets.remove(child);
    }

    @Override
    public Componet getChildren(int index) {
        if (childComponets == null || childComponets.size() == 0) {
            return null;
        }
        if (index < 0 || index >= childComponets.size()) {
            return null;
        }
        return childComponets.get(index);
    }
}
