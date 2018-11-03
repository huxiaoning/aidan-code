package org.aidan.unshare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午6:03
 * @描述: 供测试用，在内存中模拟数据库中的值
 */
public class TestDB {
    /**
     * 用来存放单独授权数据的值
     */
    public static Collection<String> colDB = new ArrayList<>();

    /**
     * 用来存放组合授权数据的值
     */
    public static Map<String, String[]> mapDB = new HashMap<>();

    static {
        colDB.add("张三,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,操作薪资数据,,2");

        mapDB.put("操作薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});

        // 增加更多授权数据
        for (int i = 0; i < 3; i++) {
            colDB.add("张三" + i + ",人员列表,查看,1");
        }
    }
}
