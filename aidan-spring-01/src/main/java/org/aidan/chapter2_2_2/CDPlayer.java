package org.aidan.chapter2_2_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午11:07
 * @描述: CDPlayer
 */
@Component(value = "cDPlayer")
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc compactDisc;

    @Override
    public void play() {
        compactDisc.play();
    }
}
