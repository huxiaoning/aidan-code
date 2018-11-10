package org.aidan.chapter2_2_2;

import org.springframework.stereotype.Component;

/**
 * @author Aidan
 * @创建时间：2018/11/10 上午10:38
 * @描述: SgtPeppers
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
