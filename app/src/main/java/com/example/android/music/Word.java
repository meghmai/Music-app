package com.example.android.music;

/**
 * Created by lenovo on 6/6/2017.
 */

public class Word {
    private String mtrack;
    private String martist;
    private int mimg1;
    private int mimg2;
    private String mtitle;

    public Word(String track, String artist) {
        mtrack = track;
        martist = artist;
    }

    public Word(String title) {
        mtitle = title;
    }

    public Word(int img1, int img2, String title) {
        mimg1 = img1;
        mimg2 = img2;
        mtitle = title;
    }

    public String getMtrack() {
        return mtrack;
    }

    public String getMartist() {
        return martist;
    }

    public int getMimg1() {
        return mimg1;
    }

    public int getMimg2() {
        return mimg2;
    }

    public String getMtitle() {
        return mtitle;
    }

    @Override
    public String toString() {
        return mtrack;
    }
}
