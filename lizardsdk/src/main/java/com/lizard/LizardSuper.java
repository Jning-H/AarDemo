package com.lizard;

import android.util.Log;

import com.kerry.Kerry;

/**
 * Created by Administrator on 2018-05-19.
 */

public class LizardSuper {
    private static final String TAG= "aar_Lizard";
    private String mName;
    public String getmName() {
        return mName;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public LizardSuper print(){
        Log.e(TAG,mName+"     LizarFather");
        return this;
    }

    public void useKerryPrint(){
        new Kerry(this.getClass().getSimpleName()).print();
    }
}
