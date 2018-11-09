package org.aidan.chapter1_1_3;

import java.io.PrintStream;

/**
 * @author Aidan
 * @创建时间：2018/11/9 下午4:14
 * @描述: 游吟诗人类
 * 他会有骑士战斗前和战斗后吟诗
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        // 探险之前调用此方法
        stream.println("这个骑士真勇敢，他要开始挑战怪龙了啊！！！！");
    }

    public void singAfterQuest() {
        // 探险之后调用此方法
        stream.println("到处传唱这个骑士的勇猛事迹！！！！");
    }
}
