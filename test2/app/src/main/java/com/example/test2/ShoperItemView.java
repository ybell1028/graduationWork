package com.example.test2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ShoperItemView extends LinearLayout {
    TextView name_t;
    TextView situation_t;
    ImageView imageView;

    public ShoperItemView(Context context) {
        super(context);
        init(context);
    }

    public ShoperItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
       LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       inflater.inflate(R.layout.shoper_item, this, true);

       name_t = (TextView) findViewById(R.id.name);
       situation_t = (TextView) findViewById(R.id.situation);
       imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setName(String name){
        name_t.setText(name);
    }

    public void setSituation_t(String situation){
        situation_t.setText(situation);
    }

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }
}
