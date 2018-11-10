package org.aidan.chapter2_4;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午11:07
 * @描述: CDPlayer
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }


    @Override
    public void play() {
        compactDisc.play();
    }
}
