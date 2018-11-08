package org.aidan.template;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/11/7 下午3:11
 * @描述: 对象结构，通常在这里对元素对象进行遍历，让访问者能访问到所有的元素
 */
public class ObjectStructure {

    /**
     * 示意，表示对象结构，可以是一个组合结构，或是集合
     */
    private Collection<Element> col = new ArrayList<>();

    /**
     * 示意方法，提供给客户端操作的高层接口
     *
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        // 循环对象结构中的元素，接受访问
        for (Element ele : col) {
            ele.accept(visitor);
        }
    }

    /**
     * 示意方法，组建对象结构，向对象结构中添加元素
     * 不同的对象结构有不同的构建方式
     *
     * @param ele
     */
    public void addElement(Element ele) {
        this.col.add(ele);
    }
}
