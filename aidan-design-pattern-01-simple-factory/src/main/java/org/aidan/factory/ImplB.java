package org.aidan.factory;

class ImplB implements Api {
    @Override
    public void test1(String s) {
        System.out.println("ImplB打印输出参数s = " + s);
    }
}
