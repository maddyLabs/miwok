package com.example.maddy.miwok.model;

/**
 * Created by Maddy on 11/15/2017.
 */

public class WordColors
{
    private String mMewokTranslation;
    private String mDefaultTranslation;
    private  int mColorImage;
    private  int mColorAudio;

    public void setAssets(String mewokTranslation,String defaultTranslation,int colorImage)
    {
        mewokTranslation=mewokTranslation;
        mDefaultTranslation=defaultTranslation;
        mColorImage=colorImage;

    }

     public WordColors(int colorImage,  String defaultTranslation,String mewokTranslation,int colorAudio)
    {
        this.mColorImage=colorImage;
        this.mDefaultTranslation=defaultTranslation;
        this.mMewokTranslation=mewokTranslation;
        this.mColorAudio=colorAudio;;
    }

    public String getMewokTranslation() {
        return mMewokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmColorImage() {return mColorImage;}

    public int getmColorAudio(){ return  mColorAudio;}
}
