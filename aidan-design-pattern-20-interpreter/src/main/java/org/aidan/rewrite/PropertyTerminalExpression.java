package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/3 下午2:36
 * @描述: 属性作为终结符对应的解释器
 */
public class PropertyTerminalExpression extends ReadXmlExpression {

    /**
     * 属性名字
     */
    private String propertyName;

    /**
     * 构造器
     *
     * @param propertyName
     */
    public PropertyTerminalExpression(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String[] interpret(Context c) {
        String[] ss = new String[1];
        ss[0] = c.getPreEle().getAttribute(this.propertyName);
        return ss;
    }
}
