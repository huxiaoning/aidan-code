package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/10/25 下午5:23
 * @描述: 抽象组件对象, 为组合中的对象声明接口，实现接口的缺省行为
 */
public abstract class Componet {

    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    public abstract void someOperation();

    /**
     * 向组合对象中加入组件对象
     *
     * @param child
     */
    public void addChild(Componet child) {
        /*
        缺省的实现，抛出例外，因为叶子对象没有这个功能，或者子组件没有覆盖这个方法
        有点像HttpServlet中的doGet等方法，默认实现返回405状态码，表示此方法没有被覆盖，所有method not support
         */
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    public void removeChild(Componet child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 返回某个索引对应的组件对象
     *
     * @param index
     * @return
     */
    public Componet getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
