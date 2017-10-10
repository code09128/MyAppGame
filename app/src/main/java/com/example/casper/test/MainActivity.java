package com.example.casper.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void clickNEW(View view) {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("遊戲規則說明")
                .setMessage("歡迎勇者加入偉大的航道行列" +
                        "\n\n1.金錢從怪物上獲得(廢話)" +
                        "\n\n2.獲得金錢可以做訓練,學習技能,商店購買裝備" +
                        "\n\n3.訓練方式：選一個想要訓練的屬性訓練,會隨機產生1-5點屬性加入你的角色狀態中" +
                        "\n\n4.挑戰BOSS只要做好一切準備就可挑戰,吃土吃到飽,角色人沒人保,越戰才能越強" +
                        "\n\n5.最後好好享受懶人遊戲的過關快感(X)" +
                        "\n\n※投資金錢有賺有賠戰鬥前應詳閱公開說明書")
                .setPositiveButton("我知道了", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        jumptomain2();
                    }

                })
                .show();


        SharedPreferences sp=getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("myvalue","gamedata");
        ed.commit();

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {

    }

    private void jumptomain2() {

        Intent in = new Intent();
        in.setClass(MainActivity.this,ActorActivity.class);
        startActivity(in);
        MainActivity.this.finish();
        //setContentView(R.layout.activity_actor);

    }


    public void clickCON(View view) {

        SharedPreferences sp=getSharedPreferences("data", MODE_PRIVATE);
        String str=sp.getString("myvalue","default");
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();

    }
}
