package com.kerry;

import android.util.Log;

/**
 * Created by Administrator on 2018-05-19.
 */

public class KerryFather {
    private static final String TAG= "aar_Kerry";
    private String mName;
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public void print(){
        Log.e(TAG,this.getClass().getSimpleName()+"     "+mName);
    }
}
