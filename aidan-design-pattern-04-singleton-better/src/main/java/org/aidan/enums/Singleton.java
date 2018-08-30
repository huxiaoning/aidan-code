package org.aidan.enums;

/**
 * 使用枚举来实现单例模式的示例
 */
public enum Singleton {

    /**
     * 定义一个枚举元素,它就代表了Singleton的一个实例
     */
    uniqueInstance;

    /**
     * 示意方法，单例可以有自已的操作
     */
    public void singletonOperation() {
        System.out.println("功能处理");
    }

    public static void main(String[] args) {
        Singleton.uniqueInstance.singletonOperation();

    }
}
