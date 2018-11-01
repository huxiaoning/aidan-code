package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午3:01
 * @描述: 真正的读者，为了简单就描述一下姓名
 */
public class Reader implements Observer {

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读它，内容是====" + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
