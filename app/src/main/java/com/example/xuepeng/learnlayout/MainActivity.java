package com.example.xuepeng.learnlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout root;
    private Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        root =new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);
       // root.setOnClickListener(this);
        //LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        for(int i=0;i<5;i++) {
            clickMe = new Button(this);
            clickMe.setText(" Remove Me");
            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    root.removeView(view);
                }
            });
            LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.weight=1;
            root.addView(clickMe,lp);

            //root.addView(clickMe)
            //root.addView(clickMe,LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            //LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            //root.addView(clickMe,lp);
        }
    }

    @Override
    public void onClick(View view) {
        root.removeView(view);
    }
}
