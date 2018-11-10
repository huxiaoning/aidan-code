package org.aidan.chapter2_3;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午1:58
 * @描述: B
 */
public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void hello() {
        a.hello();
    }
}
