package com.example.casper.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ActorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor);

        final TextView tv1 = (TextView) findViewById (R.id.textView3);



        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                tv1.setText("準備開始戰鬥: " + millisUntilFinished / 1000);
            }

            public void onFinish() {

                for (int i=0; i<50; i++)
                    tv1.setText(tv1.getText()+"\n"+Integer.toString(i));
                tv1.setText("done!");
            }

        }.start();

        /*
        for (int i=0; i<=5; i++) {
            for (int j=0; j<i; j++)
                tv1.setText(tv1.getText() + "*");
            tv1.setText((tv1.getText()+"\n"));
        }
        */


        //init();
    }




    public void BOSS(View v){

        Intent in = new Intent();
        in.setClass(ActorActivity.this,BOSS.class);
        startActivity(in);

    }

    public void equip(View view) {



    }
}
