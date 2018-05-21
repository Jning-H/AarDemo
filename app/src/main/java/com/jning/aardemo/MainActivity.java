package com.jning.aardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lizard.Lizard;
import com.yhao.floatwindow.FloatWindow;
import com.yhao.floatwindow.MoveType;
import com.yhao.floatwindow.Screen;

public class MainActivity extends AppCompatActivity {
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Lizard(this.getClass().getSimpleName()).print().useKerryPrint();

//        new Kerry("Main").print();

        ((TextView)findViewById(R.id.tv_content)).setText(R.string.float_str);

        createFloat();
    }

    private void createFloat() {
        if(FloatWindow.get() == null) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.ic_launcher);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"onClick",Toast.LENGTH_SHORT).show();
                }
            });

            FloatWindow.with(getApplicationContext())
                    .setView(imageView)
                    .setWidth(Screen.width, 0.08f)
                    .setHeight(Screen.width, 0.08f)
                    .setX(Screen.width, 0.90f)
                    .setY(Screen.height, 0.75f)
                    .setMoveType(MoveType.active)
                    .setMoveStyle(500, new BounceInterpolator())
                    .setDesktopShow(true)
                    .build();
        }
    }
}
