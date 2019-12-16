package com.example.a15puzzletolga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {
    private Button newgame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        newgame=(Button)findViewById(R.id.newgame);


        newgame.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ıntent=new Intent(Intro.this,MainActivity.class);
            startActivity(ıntent);
            Game.scramble();
        }
    });
}
}
