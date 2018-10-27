package org.aidan.privateTest;

/**
 * @author Aidan
 * @创建时间：2018/10/27 下午3:09
 * @描述: TODO
 */
public class A {
    /**
     * 这个private去掉后输出B,加上来输出A
     * <p>
     * 有private:                子类与父类的print()并不是覆盖关系，运行时执行方法为定义时类型的方法，不构成多态
     * 无private或更高访问控制符:    此时两方法为覆盖关系，运行时执行方法为实际子类类型的方法，构成多态
     * <p>
     * 总结：不要试图扩展private方法，若要扩展，则要使用比private更大的访问权限修饰符
     */
    private void print() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}
