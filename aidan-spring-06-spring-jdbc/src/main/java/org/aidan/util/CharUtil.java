package org.aidan.util;

/**
 * @author Aidan
 * @创建时间：2018/11/26 4:09 PM
 * @描述: CharUtil
 */
public class CharUtil {
    /**
     * a的阿斯克码值:97
     */
    public static final int a = 'a';
    /**
     * z的阿斯克码值:122
     */
    public static final int z = 'z';
    /**
     * A的阿斯克码值:65
     */
    public static final int A = 'A';
    /**
     * Z的阿斯克码值:90
     */
    public static final int Z = 'Z';

    /**
     * 大小写字母 阿斯克码值之差 小写的大:32
     */
    public static final int DIFFERENCE = a - A;

    /**
     * char的阿斯克码值
     *
     * @param x
     * @return
     */
    public static int char2Ask(char x) {
        return x;
    }

    public static char ask2Char(int x) {
        return (char) x;
    }

    /**
     * 大写字母 转 下划线+小写字母
     *
     * @return
     */
    public static String camel2Underline(char c) {
        int i = char2Ask(c);
        i += DIFFERENCE;
        c = ask2Char(i);
        return "_" + c;
    }

    public static void main(String[] args) {


        System.out.println(char2Ask('A'));
        System.out.println(ask2Char(A));
    }


}
