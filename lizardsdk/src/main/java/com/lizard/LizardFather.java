package com.lizard;

import android.util.Log;

import com.kerry.KerryChild;

/**
 * Created by Administrator on 2018-05-19.
 */

public class LizardFather {
    private static final String TAG= "aar_Lizard";
    private String mName;
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public LizardFather print(){
        Log.e(TAG,this.getClass().getSimpleName()+"     "+mName);
        return this;
    }

    public void useKerryPrint(){
        new KerryChild("Main").print();
    }
}
