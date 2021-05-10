package com.example.onestar_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Account extends AppCompatActivity {

    private ImageButton ePersonal;
    private ImageButton ePast;
    private ImageButton eDoctor;

    private ImageButton eShare;
    private ImageButton eHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        String user = MainActivity.getUser();
        String pass = MainActivity.getPass();

        ePersonal = findViewById(R.id.personalInfo);
        ePast = findViewById(R.id.pastScans);
        eDoctor = findViewById(R.id.doctors);
        eShare = findViewById(R.id.shareButton);
        eHome = findViewById(R.id.homeButton);

        ePersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, PersonalInfo.class);
                startActivity(intent);
            }
        });

        ePast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, PastScans.class);
                startActivity(intent);
            }
        });

        eDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, Doctor.class);
                startActivity(intent);
            }
        });

        eShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, Share.class);
                startActivity(intent);
            }
        });

        eHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Account.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}