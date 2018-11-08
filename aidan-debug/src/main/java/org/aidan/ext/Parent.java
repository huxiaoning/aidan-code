package org.aidan.ext;

/**
 * @author Aidan
 * @创建时间：2018/11/8 下午3:32
 * @描述: TODO
 */
public class Parent {

    public void hello() {
        System.out.println("Parent.hello");
    }

    public static void main(String[] args) {
        Parent person = new Child();
        person.hello();
    }
}
