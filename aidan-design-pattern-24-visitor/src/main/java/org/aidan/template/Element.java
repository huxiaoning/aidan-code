package org.aidan.template;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午2:59
 * @描述: 被访问的元素接口
 */
public abstract class Element {

    /**
     * 接受访问者的访问
     *
     * @param visitor 访问者对象
     */
    public abstract void accept(Visitor visitor);
}
