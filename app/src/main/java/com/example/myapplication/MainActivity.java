package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 一个activity理解为一个页面
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 这个方法是当activity第一次启动的时候执行
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3tablelayout);
    }
}
