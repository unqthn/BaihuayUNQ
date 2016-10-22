package com.example.you.baihuayunq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button you = (Button) findViewById(R.id.button);
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("uuu", "เลขท้าย 2 ตัว");
                Huay U = new Huay();
                i.putExtra("unq", U.getRandomTwoDigits());
                startActivity(i);
            }
        });

        Button turn = (Button) findViewById(R.id.button2);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("uuu", "เลขท้าย 3 ตัว");
                Huay U = new Huay();
                i.putExtra("unq", U.getRandomThreeDigits());
                startActivity(i);
            }
        });


    }
}