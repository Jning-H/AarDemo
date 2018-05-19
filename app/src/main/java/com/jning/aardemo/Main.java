package com.jning.aardemo;

import com.kerry.KerryChild;
import com.lizard.LizardChild;

/**
 * Created by Administrator on 2018-05-19.
 */

public class Main {
    public void main (String [] args){
        new LizardChild("Main").print();
        new KerryChild("Main").print();
    }
}
