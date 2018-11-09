package org.aidan.chapter1_1_2;

import java.io.PrintStream;

/**
 * @author Aidan
 * @创建时间：2018/11/9 上午11:28
 * @描述: 杀死怪龙的任务(探索)
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
