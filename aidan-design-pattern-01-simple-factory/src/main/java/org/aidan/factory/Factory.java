package org.aidan.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {

    /**
     * 简单工厂
     *
     * @param condition
     * @return
     */
    public static Api createApi(int condition) {
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }

        return api;
    }


    /**
     * 可配置的简单工厂
     */
    public static Api createApi() {
        Properties properties = new Properties();
        InputStream in = Factory.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("装载工厂配置文件出错，具体堆栈信息如下");
            e.printStackTrace();
        }
        Api api = null;
        String implClass = properties.getProperty("implClass");
        try {
            api = (Api) Class.forName(implClass).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }


}
