package com.jning.aardemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lizard.Lizard;
import com.umeng.message.common.Const;
import com.umeng.message.common.UmLog;
import com.yhao.floatwindow.FloatWindow;
import com.yhao.floatwindow.MoveType;
import com.yhao.floatwindow.Screen;

public class MainActivity extends AppCompatActivity {
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floatwindow);//引用FloatWindow的layout资源

        new Lizard(this.getClass().getSimpleName())
                .print()
                .useKerryPrint();

//        new Kerry("Main").print();

//        LinearLayout layoutRight = (LinearLayout)findViewById(R.id.layout_right);//FloatWindow中layout资源的局部布局
//        View view = LayoutInflater.from(this).inflate(R.layout.activity_main,null);
//        layoutRight.addView(view);
//
//        ((TextView)findViewById(R.id.tv_content)).setText(getResources().getString(R.string.float_str) + "\nMain引用FloatWindow的资源" );//主工程引用FloatWindow String资源
//        ((TextView)findViewById(R.id.tv_hello)).setTextColor(getResources().getColor(R.color.greeny));//主工程引用FloatWindow color资源
//
//
//
//        ((TextView)findViewById(R.id.tv_float_test)).setText("build_type: "+BuildConfig.BUILD_TYPE);
//        ((TextView)findViewById(R.id.tv_float_test)).setTextColor(getResources().getColor(R.color.greeny));//引用FloatWindow color资源s
//
//        String getResStr=FloatWindow.getRes(this);

        createFloat();

        UmLog.d("JarTest","引用KerrySdk中的jar包 "+ Const.HOST);
        Toast.makeText(this,"引用KerrySdk中的jar包 \n"+ Const.HOST,Toast.LENGTH_LONG).show();
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
