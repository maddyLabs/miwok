package com.example.maddy.miwok.model;

/**
 * Created by Maddy on 11/11/2017.
 */

public class Word {
    private String mMewokTranslation;
    private String mDefaultTranslation;
    private int mNumberImage;

    private int mNumberAudio;

    public Word(int numberImage,String defaultTranslation, String mewokTranslation,int numberAudio) {
        this.mNumberImage=numberImage;
        this.mDefaultTranslation = defaultTranslation;
        this.mMewokTranslation = mewokTranslation;
        this.mNumberAudio=numberAudio;
    }

    public String getMewokTranslation() {
        return mMewokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmNumberImage() {
        return mNumberImage;
    }

    public int getmNumberAudio() {
        return mNumberAudio;
    }
}
