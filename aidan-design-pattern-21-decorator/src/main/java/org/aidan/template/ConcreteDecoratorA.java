package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午6:22
 * @描述: 装饰器的具体实现，向组件对象添加职责
 */
public class ConcreteDecoratorA extends Decorator {
    /**
     * 构造器，传入组件对象
     *
     * @param component 组件对象
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 添加的状态
     */
    private String addedState;

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    @Override
    public void operation() {
        // 调用父类的方法，可以在调用前后执行一些附加操作
        // 在这里进行处理的时候，可以使用添加的状态
        super.operation();
    }
}
