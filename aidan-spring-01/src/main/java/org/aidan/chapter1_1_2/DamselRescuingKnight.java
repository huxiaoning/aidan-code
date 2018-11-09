package org.aidan.chapter1_1_2;

/**
 * @author Aidan
 * @创建时间：2018/11/9 上午10:47
 * @描述: 少女拯救骑士
 */
public class DamselRescuingKnight implements Knight {

    /**
     * 少女拯救任务
     */
    private DamselRescuingQuest quest;

    public DamselRescuingKnight() {
        // 与DamselRescuingQuest紧耦合
        this.quest = new DamselRescuingQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
