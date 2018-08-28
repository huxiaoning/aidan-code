package org.aidan.factory;

class ImplA implements Api {
    @Override
    public void test1(String s) {
        System.out.println("ImplA打印输出参数s = " + s);
    }
}
