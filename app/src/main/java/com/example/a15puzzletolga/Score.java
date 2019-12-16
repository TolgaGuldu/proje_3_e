package com.example.a15puzzletolga;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class Score extends TextView {
    public Score(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void scorecalculate() {
        long time = System.currentTimeMillis() - Config.startTime;
        int count= Config.count;
        int calculate= (int) (100000-((time/1000)*count));
        setText("SCORE: " +calculate);
    }

}
