package org.aidan.nopattern;

/**
 * @author Aidan
 * @创建时间：2018/10/27 上午11:16
 * @描述: 描述工作人员信息的数据信息
 */
public class WorkerUserModel {

    private String uuid;
    private String workId;
    private String pwd;
    private String name;

    @Override
    public String toString() {
        return "WorkerUserModel{" +
                "uuid='" + uuid + '\'' +
                ", workId='" + workId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
