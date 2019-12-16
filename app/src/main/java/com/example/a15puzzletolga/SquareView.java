package com.example.a15puzzletolga;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public class SquareView extends TextView implements View.OnClickListener{
    public int num=10;
    public void setNum(int n)
    {
        num=n;
        this.setText(String.valueOf(num));
        if(num==0){

            this.setBackgroundColor(0x00000000);
            this.setTextColor(0x00000000);
        }
        else{
            this.setTextColor(Color.BLACK);
            for(int i=0;i<Config.color_red.length;i++)
                if(num==Config.color_red[i])
                    this.setBackgroundResource(R.drawable.square_view_background_red);
            for(int i=0;i<Config.color_blue.length;i++)
                if(num==Config.color_blue[i])
                    this.setBackgroundResource(R.drawable.square_view_background_blue);
            for(int i=0;i<Config.color_green.length;i++)
                if(num==Config.color_green[i])
                    this.setBackgroundResource(R.drawable.square_view_background_green);
            for(int i=0;i<Config.color_yellow.length;i++)
                if(num==Config.color_yellow[i])
                    this.setBackgroundResource(R.drawable.square_view_background_yellow);
        }


    }
    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);


        this.setTextSize(TypedValue.COMPLEX_UNIT_SP,60);
        this.setGravity(Gravity.CENTER);
        setOnClickListener(this);
        if(num==0)
            this.setBackgroundColor(Color.WHITE);
    }


    @Override
    public void onClick(View v) {
        Game.play(num);
    }
}