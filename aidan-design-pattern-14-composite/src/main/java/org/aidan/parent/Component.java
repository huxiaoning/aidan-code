package org.aidan.parent;

import java.util.List;

/**
 * @author Aidan
 * @创建时间：2018/10/26 下午4:52
 * @描述: 抽象组件
 */
public abstract class Component {

    private static final String EXCEPTION_MSG = "对象不支持这个功能";

    private Component parent = null;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public List<Component> getChildren() {
        throw new UnsupportedOperationException(EXCEPTION_MSG);
    }

    public void addChildren(Component child) {
        throw new UnsupportedOperationException(EXCEPTION_MSG);
    }

    public void removeChildren(Component child) {
        throw new UnsupportedOperationException(EXCEPTION_MSG);
    }

    public void getChildren(int index) {
        throw new UnsupportedOperationException(EXCEPTION_MSG);
    }

    public abstract void printStruct(String preStr);
}
