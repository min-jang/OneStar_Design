package com.example.onestar_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeScreen extends AppCompatActivity {

    private ImageButton eAccount;
    private ImageButton eShare;
    private ImageButton eAddDesign;
    private ImageButton eWrist;
    private ImageButton eAnkle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen2);

        eAnkle = findViewById(R.id.ankleButton);
        eWrist = findViewById(R.id.wristButton);
        eAccount = findViewById(R.id.accountButton);
        eShare = findViewById(R.id.shareButton);

        eAnkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, AnkleDesign.class);
                startActivity(intent);
            }
        });

        eWrist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, WristDesign.class);
                startActivity(intent);
            }
        });

        eAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Account.class);
                startActivity(intent);
            }
        });

        eShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this, Share.class);
                startActivity(intent);
            }
        });
    }
}