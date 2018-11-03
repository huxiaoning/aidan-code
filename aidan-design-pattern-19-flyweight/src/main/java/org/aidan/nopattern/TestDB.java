package org.aidan.nopattern;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aidan
 * @创建时间：2018/11/1 下午6:17
 * @描述: 测试使用，在内存中模拟数据库中的值
 */
public class TestDB {

    public static final Collection<String> colDB = new ArrayList<>();

    static {
        // 通过静态代码块来填充模拟的数据
        colDB.add("张三,人员列表,查看");
        colDB.add("李四,人员列表,查看");
        colDB.add("李四,薪资数据,查看");
        colDB.add("李四,薪资数据,修改");
        // 增加更多的授权数据
        for (int i = 0; i < 3; i++) {
            colDB.add("张三" + i + ",人员列表,查看");
        }
    }
}
