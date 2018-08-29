package org.aidan.properties;

public class Client {

    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();
        String driver = appConfig.getProperty("driver");
        String url = appConfig.getProperty("url");
        String user = appConfig.getProperty("user");
        String password = appConfig.getProperty("password");

        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
    }
}
