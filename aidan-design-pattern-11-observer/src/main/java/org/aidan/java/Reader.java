package org.aidan.java;


import java.util.Observable;
import java.util.Observer;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午3:54
 * @描述: 真正的读者
 */
public class Reader implements Observer {

    /**
     * 读者的姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 这里采用推的方式
     *
     * @param o
     * @param obj
     */
    @Override
    public void update(Observable o, Object obj) {
        // 这是采用推的模式
        System.out.println(name + "收到报纸了，阅读先。目标推过来的内容是===" + obj);
        // 这是获取拉的数据
        System.out.println(name + "收到报纸了，阅读它，主动到目标对象去拉的内容是===" + ((NewsPaper) o).getContent());
    }
}