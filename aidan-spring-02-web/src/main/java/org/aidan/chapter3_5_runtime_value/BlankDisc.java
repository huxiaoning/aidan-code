package org.aidan.chapter3_5_runtime_value;

/**
 * @author Aidan
 * @创建时间：2018/11/10 下午5:26
 * @描述: BlankDisc
 */
public class BlankDisc {

    private String title;

    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
