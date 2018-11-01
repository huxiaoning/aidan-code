package org.aidan.sample1;

/**
 * @author Aidan
 * @创建时间：2018/10/18 下午2:58
 * @描述: 报纸对象，是具体的目标实现
 */
public class NewsPaper extends Subject {

    /**
     * 报纸的内容
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        // 内容对变化，说明出版了新报纸，那就通知所有的读者
        notifyObservers();
    }
}
