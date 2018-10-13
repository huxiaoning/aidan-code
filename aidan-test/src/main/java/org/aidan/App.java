package org.aidan;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(1538038095000L)));
    }
}
