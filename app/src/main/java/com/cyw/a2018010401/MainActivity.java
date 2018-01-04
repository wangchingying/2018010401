package com.cyw.a2018010401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //1. 把textview直接放入畫面,不使用layout
        /*
            TextView tv=new TextView(this);
            tv.setText("Hello World!!");
            setContentView(tv);
            */
        //2.直接把button放進畫面
        Button bt1=new Button(this);
        //setContentView(bt1);

        //加一個button2,並將兩個按鈕放到一個linear layout裡
        LinearLayout layout=new LinearLayout(this);
        LinearLayout layout2=new LinearLayout(this);
        Button bt2=new Button(this);
        Button bt3=new Button(this);
        Button bt4=new Button(this);
        Button bt5=new Button(this);
        Button bt6=new Button(this);

        FrameLayout flayout=new FrameLayout(this);
        //setContentView(flayout);

        setContentView(layout);
        //setContentView(layout2);
        //setContentView只能一個
        //setContentView(layout);
        //Liner layout 可設直或橫的, 研究一下九宮格怎麼寫
        layout2.setOrientation(LinearLayout.VERTICAL);
        layout2.setMinimumWidth(1);
        bt1.setText("我是按鈕1");
        bt2.setText("我是按鈕2");
        bt3.setText("我是按鈕3");
        bt4.setText("我是按鈕4");
        bt5.setText("我是按鈕5");
        bt6.setText("我是按鈕6");
        //把按鈕加到layout裡
        layout.addView(bt1);
        layout.addView(bt2);
        layout.addView(bt3);
        layout2.addView(bt4);
        layout2.addView(bt5);
        layout2.addView(bt6);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你按鈕1了!",Toast.LENGTH_LONG).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"你按鈕2了!",Toast.LENGTH_LONG).show();
            }
        });
        //顯示可運用的上下視窗長度
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        Toast.makeText(MainActivity.this, height + "," + width, Toast.LENGTH_SHORT).show();

    }
}
