package com.example.onestar_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Share extends AppCompatActivity {

    private ImageButton eAccount;
    private ImageButton eHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        eAccount = findViewById(R.id.accountButton);
        eHome = findViewById(R.id.homeButton);

        eHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, HomeScreen.class);
                startActivity(intent);
            }
        });

        eAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Share.this, Account.class);
                startActivity(intent);
            }
        });
    }
}