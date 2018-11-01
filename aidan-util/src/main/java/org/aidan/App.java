package org.aidan;

/**
 * @author Aidan
 * @创建时间：2018/10/29 上午11:10
 * @描述: TODO
 */
public class App {
    public static void main(String[] args) {
        Class<Api> apiClass = Api.class;
        System.out.println(apiClass);
        System.out.println(apiClass.getPackage().getName());
        
    }
}
