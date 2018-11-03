package org.aidan.rewrite;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/11/2 下午3:26
 * @描述: 安全管理，实现成单例
 */
public class SecurityMgr {

    private static SecurityMgr securityMgr = null;

    private SecurityMgr() {
    }

    public static SecurityMgr getInstance() {
        if (securityMgr == null) {
            synchronized (SecurityMgr.class) {
                if (securityMgr == null) {
                    securityMgr = new SecurityMgr();
                }
            }
        }
        return securityMgr;
    }

    /**
     * 在运行期间，用来存放登录人员对应的权限
     * 在web应用中，这些数据通常会存放到session中
     */
    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    /**
     * 模拟用户登录
     *
     * @param user
     */
    public void login(String user) {
        // 登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.size() == 0) {
            return false;
        }
        for (Flyweight fw : col) {
            System.out.println("fw == " + fw);
            if (fw.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] ss = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight fw = FlyweightFactory.getInstance().getFlyweight(ss[1] + "," + ss[2]);
                col.add(fw);
            }
        }
        return col;
    }
}
