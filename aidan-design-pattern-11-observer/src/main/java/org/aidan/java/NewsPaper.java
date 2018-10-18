package org.aidan.java;

import java.util.Observable;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午3:48
 * @描述: 报纸对象具体的目标实现
 */
public class NewsPaper extends Observable {

    /**
     * 报纸的具体内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        /* 内容有了说明又出新报纸了，那就通知所有读者 */
        /* 注意在用Java中的Observer模式的时候，下面这句话不能少 */
        this.setChanged();
        // 然后主动通知，这里用的是推的模式
        this.notifyObservers(this.content);
        // 如果是拉的模式，这么调用
        // this.notifyObservers();
    }
}
