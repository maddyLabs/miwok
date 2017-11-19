package com.example.maddy.miwok.model;

/**
 * Created by Maddy on 11/15/2017.
 */

public class FamilyList {
    private String mDefaultName;
    private String mMiwokName;
    private int mImageId;

    public FamilyList(int imageId,String defaultName, String miwokName) {
        mImageId=imageId;
        mDefaultName = defaultName;
        mMiwokName = miwokName;
    }

    public String getmDefaultName() {
        return mDefaultName;
    }

    public String getmMiwokName() {
        return mMiwokName;
    }

    public int getmImageId() {
        return mImageId;
    }

}
