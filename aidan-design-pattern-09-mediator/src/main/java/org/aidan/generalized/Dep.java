package org.aidan.generalized;

/**
 * @author Aidan
 * @创建时间：2018/9/26 下午2:24
 * @描述: 部门类
 */
public class Dep {

    /**
     * 部门id
     */
    private String depId;
    /**
     * 部门名称
     */
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 撤销部门
     *
     * @return 是否撤销成功
     */
    public boolean deleteDep() {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }
}
