package org.aidan.rewrite;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/11/3 下午2:12
 * @描述: 元素做为非终结符对应的解释器，解释并执行中间元素
 */
public class ElementExpression extends ReadXmlExpression {

    /**
     * 用来记录组合的ReadXmlExpression
     */
    private Collection<ReadXmlExpression> eles = new ArrayList<>();

    /**
     * 元素名称
     */
    private String eleName;

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    /**
     * 对子元素的维护，添加元素
     *
     * @param ele
     * @return
     */
    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    /**
     * 对子元素的维护删除元素
     *
     * @param ele
     * @return
     */
    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context c) {
        Element preEle = c.getPreEle();
        if (preEle == null) {
            c.setPreEle(c.getDocument().getDocumentElement());
        } else {
            Element nowEle = c.getNowEle(preEle, eleName);
            c.setPreEle(nowEle);
        }

        // 循环调用子元素的interpret方法
        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }
}
