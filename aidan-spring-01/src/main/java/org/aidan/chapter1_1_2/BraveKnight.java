package org.aidan.chapter1_1_2;

/**
 * @author Aidan
 * @创建时间：2018/11/9 上午10:57
 * @描述: 勇士
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
