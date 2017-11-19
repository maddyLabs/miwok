package com.example.maddy.miwok.model;

/**
 * Created by Maddy on 11/15/2017.
 */

public class PhrasesList
{
    private String mDefaultPhrase;
    private String mMiwokPhrase;
    private  int mPhraseAudio;

    public PhrasesList(String defaultPhrase,String miwokPhrase,int phraseAudio)
    {
        mDefaultPhrase=defaultPhrase;
        mMiwokPhrase=miwokPhrase;
        mPhraseAudio=phraseAudio;
    }

    public String getmDefaultPhrase()
    {
        return mDefaultPhrase;
    }

    public String getmMiwokPhrase()
    {
        return mMiwokPhrase;
    }

    public int getmPhraseAudio () { return mPhraseAudio;}
}
