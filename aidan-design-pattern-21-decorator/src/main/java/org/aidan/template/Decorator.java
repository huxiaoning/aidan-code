package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/5 下午4:09
 * @描述: 装饰器接口, 维持一个指向组件对象的接口对像，并定义一个与组件接口一致的接口
 */
public abstract class Decorator extends Component {

    /**
     * 持有组件对象
     */
    protected Component component;

    /**
     * 构造器，传入组件对象
     *
     * @param component 组件对象
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
