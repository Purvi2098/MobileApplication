package com.example.purvi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class prac61 extends AppCompatActivity {
    ImageView img;
    Button btnrotate,btntranslate,btnscale,btnalpha;
    Animation rotateAnim,tansanim,scaleanim,alphanim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img=findViewById(R.id.imageView2);
        btnrotate=findViewById(R.id.rotate);
        btntranslate=findViewById(R.id.translate);
        btnscale=findViewById(R.id.scale);
        btnalpha=findViewById(R.id.alpha);
        btnrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateAnim = AnimationUtils.loadAnimation(prac61.this,R.anim.rotate);
                img.startAnimation(rotateAnim);
            }
        });
        btntranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tansanim=AnimationUtils.loadAnimation(prac61.this,R.anim.animtrans);
                img.startAnimation(tansanim);
            }
        });

        btnscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaleanim=AnimationUtils.loadAnimation(prac61.this,R.anim.scaleanim);
                img.startAnimation(scaleanim);
            }
        });

        btnalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alphanim=AnimationUtils.loadAnimation(prac61.this,R.anim.alphanim);
                img.startAnimation(alphanim);
            }
        });
    }
}

