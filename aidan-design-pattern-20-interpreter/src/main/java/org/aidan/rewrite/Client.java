package org.aidan.rewrite;

/**
 * @author Aidan
 * @创建时间：2018/11/3 下午2:41
 * @描述: 客户端测试类
 */
public class Client {

    private static final String filePathName = "/Users/aidan/IdeaProjects/aidan-code/aidan-design-pattern-20-interpreter/src/main/resources/rewrite.xml";

    public static void main(String[] args) {
//        a();
        b();
    }

    /**
     * root/a/b/c.name
     */
    private static void b() {
        Context c = new Context(filePathName);

        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementExpression cEle = new ElementExpression("c");
        PropertyTerminalExpression prop = new PropertyTerminalExpression("name");

        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        cEle.addEle(prop);

        String[] ss = root.interpret(c);
        for (String s : ss) {
            System.out.println(s);
        }

        c.reInit();
        ss = root.interpret(c);
        for (String s : ss) {
            System.out.println(s);
        }

    }

    /**
     * root/a/b/c
     */
    private static void a() {
        Context c = new Context(filePathName);

        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");

        // 组合起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);

        String[] ss = root.interpret(c);
        for (String s : ss) {
            System.out.println(s);
        }
    }

}
