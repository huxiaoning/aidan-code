package org.aidan.nopattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Aidan
 * @创建时间：2018/11/1 下午6:23
 * @描述: 安全管理，实现成单例
 */
public class SecurityMgr {

    private static final SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {

    }

    public static SecurityMgr getInstance() {
        return securityMgr;
    }

    /**
     * 在运行期间，用来存放登录人员对应的权限
     * 在web应用中，这些数据通常会存放到session中
     */
    private Map<String, Collection<AuthorizationModel>> map = new HashMap<>();

    /**
     * 模拟登录功能
     *
     * @param user
     */
    public void login(String user) {
        // 登录时就该把用户所拥有权限，从数据库中取出来,放到缓存中去
        Collection<AuthorizationModel> col = queryByUser(user);
        map.put(user, col);
    }

    /**
     * 从数据库中取出某人所拥有的权限
     *
     * @param user
     * @return
     */
    private Collection<AuthorizationModel> queryByUser(String user) {
        Collection<AuthorizationModel> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                col.add(new AuthorizationModel(split[0], split[1], split[2]));
            }
        }
        return col;
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<AuthorizationModel> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (AuthorizationModel am : col) {
            System.out.println("am = " + am);
            if (!am.getSecurityEntity().equals(securityEntity)) {
                continue;
            }
            if (!am.getPermit().equals(permit)) {
                continue;
            }
            return true;
        }
        return false;
    }
}
