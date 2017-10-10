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

        for (int i=0; i<50; i++)
            tv1.setText(tv1.getText()+"\n"+Integer.toString(i));

        /*
        for (int i=0; i<=5; i++) {
            for (int j=0; j<i; j++)
                tv1.setText(tv1.getText() + "*");
            tv1.setText((tv1.getText()+"\n"));
        }
        */


        //tv1.setText("input");
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
