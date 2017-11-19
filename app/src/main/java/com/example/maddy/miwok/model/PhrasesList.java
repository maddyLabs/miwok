package com.example.maddy.miwok.model;

/**
 * Created by Maddy on 11/15/2017.
 */

public class PhrasesList
{
    private String mDefaultPhrase;
    private String mMiwokPhrase;

    public PhrasesList(String defaultPhrase,String miwokPhrase)
    {
        mDefaultPhrase=defaultPhrase;
        mMiwokPhrase=miwokPhrase;
    }

    public String getmDefaultPhrase()
    {
        return mDefaultPhrase;
    }

    public String getmMiwokPhrase()
    {
        return mMiwokPhrase;
    }
}
