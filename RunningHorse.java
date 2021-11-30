package com.example.purvi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;

public class prac62 extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView) findViewById(R.id.horseimg);
        img.setImageResource(R.drawable.runninghorse);
        AnimationDrawable runninghorse=(AnimationDrawable) img.getDrawable();
        runninghorse.start();
    }
}
