package com.example.xuepeng.learnlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutAty extends AppCompatActivity {
    private RelativeLayout root;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        root=  new RelativeLayout(this);
        setContentView(root);
        tv=new TextView(this);
        tv.setText("hello world");
        RelativeLayout.LayoutParams lp= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.leftMargin=200;
        lp.topMargin=500;
        root.addView(tv,lp);
    }
}
