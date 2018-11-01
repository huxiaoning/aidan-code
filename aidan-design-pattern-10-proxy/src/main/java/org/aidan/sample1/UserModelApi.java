package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/13 下午4:13
 * @描述: 定义用户数据对象接口
 */
public interface UserModelApi {

    String getUserId();

    void setUserId(String userId);

    String getName();

    void setName(String name);

    String getDepId();

    void setDepId(String depId);

    String getSex();

    void setSex(String sex);
}
