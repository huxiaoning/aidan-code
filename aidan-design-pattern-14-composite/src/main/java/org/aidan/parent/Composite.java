package org.aidan.parent;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/26 下午5:00
 * @描述: 组合对象, 包含其他组合对象或者叶子对象
 */
public class Composite extends Component {

    private List<Component> childComponets = null;

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);
        if (this.childComponets == null || this.childComponets.size() == 0) {
            return;
        }
        preStr += "  ";
        for (Component component : this.childComponets) {
            component.printStruct(preStr);
        }
    }


    @Override
    public void addChildren(Component child) {
        if (this.childComponets == null) {
            this.childComponets = new ArrayList<>();
        }
        this.childComponets.add(child);

        // 添加对父组件的引用
        child.setParent(this);
    }

    @Override
    public void removeChildren(Component child) {
        if (this.childComponets == null || this.childComponets.size() == 0) {
            return;
        }
        int idx = this.childComponets.indexOf(child);
        if (idx == -1) {
            return;
        }
        childComponets.remove(child);

        for (Component component : child.getChildren()) {
            component.setParent(this);
            this.childComponets.add(component);
        }
    }

    @Override
    public List<Component> getChildren() {
        return this.childComponets;
    }
}
