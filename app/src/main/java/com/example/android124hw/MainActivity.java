package com.example.android124hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frame_ly,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frameSecond_ly,new SecondFragment()).commit();
    }
}