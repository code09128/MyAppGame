package com.example.casper.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ActorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor);


        TextView tv1 = (TextView) findViewById (R.id.textView3);
        tv1.setText("input");

        init();

    }

    private void init() {



    }


    public void BOSS(View v){

        Intent in = new Intent();
        in.setClass(ActorActivity.this,BOSS.class);
        startActivity(in);

    }

}
