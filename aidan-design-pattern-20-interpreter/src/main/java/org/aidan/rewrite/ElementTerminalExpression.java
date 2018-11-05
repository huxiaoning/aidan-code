package org.aidan.rewrite;

import org.w3c.dom.Element;

/**
 * @author Aidan
 * @创建时间：2018/11/3 下午2:29
 * @描述: 元素作为终结符对应的解释器
 */
public class ElementTerminalExpression extends ReadXmlExpression {

    /**
     * 元素名字
     */
    private String eleName;

    /**
     * 构造器
     *
     * @param eleName
     */
    public ElementTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context c) {
        Element preEle = c.getPreEle();
        Element ele;
        if (preEle == null) {
            ele = c.getDocument().getDocumentElement();
        } else {
            ele = c.getNowEle(preEle, eleName);
        }
        c.setPreEle(ele);
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;
    }
}
