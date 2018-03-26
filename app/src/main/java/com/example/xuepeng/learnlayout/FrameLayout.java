package com.example.xuepeng.learnlayout;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class FrameLayout extends AppCompatActivity  {
    private android.widget.FrameLayout root;
    private ImageView tvA,tvB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        root =findViewById(R.id.root);
        tvA=findViewById(R.id.ivA);
        tvB=findViewById(R.id.ivB);
        showA();
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tvA.getVisibility()==View.VISIBLE){
                    showB();
                }else showA();
            }
        });

    }
    private void showA(){
        tvA.setVisibility(View.VISIBLE);
        tvB.setVisibility(View.INVISIBLE);
    }

    private void showB(){
        tvB.setVisibility(View.VISIBLE);
        tvA.setVisibility(View.INVISIBLE);
    }
}

