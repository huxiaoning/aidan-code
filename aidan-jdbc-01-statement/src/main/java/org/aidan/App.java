package org.aidan;

import org.aidan.util.DBUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        testUpdate();
        testQuery();
    }

    public static void testUpdate() {
        String sql = "update customers set name = 'Tom' where id = 4";
        Integer update = DBUtils.update(sql);
    }

    public static void testQuery() {
        String sql = "select * from customers a";
        DBUtils.query(sql);
    }
}
