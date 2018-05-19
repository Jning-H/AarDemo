package com.jning.aardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizard.LizardChild;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                new LizardChild("Main").print().useKerryPrint();
        new KerryChild("Main").print();

    }
}
