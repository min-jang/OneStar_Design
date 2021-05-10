package com.example.onestar_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class AnkleDesign extends AppCompatActivity {

    private ImageButton eAccount;
    private ImageButton eShare;
    private ImageButton eHome;

    private Button eChangeC;
    private Button eChangeP;
    private Button eSave;

    private ImageButton ePattern1;
    private ImageButton ePattern2;
    private ImageButton ePattern3;
    private ImageButton ePattern4;
    private ImageButton ePattern5;
    private ImageButton ePattern6;
    private ImageButton ePattern7;
    private ImageButton ePattern8;
    private ImageButton ePattern9;
    private ImageButton ePattern10;

    private ImageView eP1;
    private ImageView eP2;
    private ImageView eP3;
    private ImageView eP4;
    private ImageView eP5;
    private ImageView eP6;
    private ImageView eP7;
    private ImageView eP8;
    private ImageView eP9;
    private ImageView eP10;

    private ImageButton eColor1;
    private ImageButton eColor2;
    private ImageButton eColor3;
    private ImageButton eColor4;
    private ImageButton eColor5;
    private ImageButton eColor6;
    private ImageButton eColor7;
    private ImageButton eColor8;
    private ImageButton eColor9;
    private ImageButton eColor10;
    private ImageButton eColor11;
    private ImageButton eColor12;
    private ImageButton eColor13;
    private ImageButton eColor14;
    private ImageButton eColor15;

    private ImageView eC1;
    private ImageView eC2;
    private ImageView eC3;
    private ImageView eC4;
    private ImageView eC5;
    private ImageView eC6;
    private ImageView eC7;
    private ImageView eC8;
    private ImageView eC9;
    private ImageView eC10;
    private ImageView eC11;
    private ImageView eC12;
    private ImageView eC13;
    private ImageView eC14;
    private ImageView eC15;


    private Button eColor;
    private Button ePattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankle_design);

        eSave = findViewById(R.id.save);

        eColor = findViewById(R.id.colorButton);
        ePattern = findViewById(R.id.patternButton);
        eChangeC = findViewById(R.id.changeCbutton);
        eChangeP = findViewById(R.id.changePbutton);

        ePattern1 = findViewById(R.id.pattern1);
        ePattern2 = findViewById(R.id.pattern2);
        ePattern3 = findViewById(R.id.pattern3);
        ePattern4 = findViewById(R.id.pattern4);
        ePattern5 = findViewById(R.id.pattern5);
        ePattern6 = findViewById(R.id.pattern6);
        ePattern7 = findViewById(R.id.pattern7);
        ePattern8 = findViewById(R.id.pattern8);
        ePattern9 = findViewById(R.id.pattern9);
        ePattern10 = findViewById(R.id.pattern10);

        eP1 = findViewById(R.id.AFO_P1);
        eP2 = findViewById(R.id.AFO_P2);
        eP3 = findViewById(R.id.AFO_P3);
        eP4 = findViewById(R.id.AFO_P4);
        eP5 = findViewById(R.id.AFO_P5);
        eP6 = findViewById(R.id.AFO_P6);
        eP7 = findViewById(R.id.AFO_P7);
        eP8 = findViewById(R.id.AFO_P8);
        eP9 = findViewById(R.id.AFO_P9);
        eP10 = findViewById(R.id.AFO_P10);

        eColor1 = findViewById(R.id.color1);
        eColor2 = findViewById(R.id.color2);
        eColor3 = findViewById(R.id.color3);
        eColor4 = findViewById(R.id.color4);
        eColor5 = findViewById(R.id.color5);
        eColor6 = findViewById(R.id.color6);
        eColor7 = findViewById(R.id.color7);
        eColor8 = findViewById(R.id.color8);
        eColor9 = findViewById(R.id.color9);
        eColor10 = findViewById(R.id.color10);
        eColor11 = findViewById(R.id.color11);
        eColor12 = findViewById(R.id.color12);
        eColor13 = findViewById(R.id.color13);
        eColor14 = findViewById(R.id.color14);
        eColor15 = findViewById(R.id.color15);

        eC1 = findViewById(R.id.AFO_C1);
        eC2 = findViewById(R.id.AFO_C2);
        eC3 = findViewById(R.id.AFO_C3);
        eC4 = findViewById(R.id.AFO_C4);
        eC5 = findViewById(R.id.AFO_C5);
        eC6 = findViewById(R.id.AFO_C6);
        eC7 = findViewById(R.id.AFO_C7);
        eC8 = findViewById(R.id.AFO_C8);
        eC9 = findViewById(R.id.AFO_C9);
        eC10 = findViewById(R.id.AFO_C10);
        eC11 = findViewById(R.id.AFO_C11);
        eC12 = findViewById(R.id.AFO_C12);
        eC13 = findViewById(R.id.AFO_C13);
        eC14 = findViewById(R.id.AFO_C14);
        eC15 = findViewById(R.id.AFO_C15);



        eAccount = findViewById(R.id.accountButton);
        eShare = findViewById(R.id.shareButton);
        eHome = findViewById(R.id.homeButton);

        eChangeC.setVisibility(View.GONE);
        eChangeP.setVisibility(View.GONE);

        ePattern1.setVisibility(View.GONE);
        ePattern2.setVisibility(View.GONE);
        ePattern3.setVisibility(View.GONE);
        ePattern4.setVisibility(View.GONE);
        ePattern5.setVisibility(View.GONE);
        ePattern6.setVisibility(View.GONE);
        ePattern7.setVisibility(View.GONE);
        ePattern8.setVisibility(View.GONE);
        ePattern9.setVisibility(View.GONE);
        ePattern10.setVisibility(View.GONE);

        eP1.setVisibility(View.GONE);
        eP2.setVisibility(View.GONE);
        eP3.setVisibility(View.GONE);
        eP4.setVisibility(View.GONE);
        eP5.setVisibility(View.GONE);
        eP6.setVisibility(View.GONE);
        eP7.setVisibility(View.GONE);
        eP8.setVisibility(View.GONE);
        eP9.setVisibility(View.GONE);
        eP10.setVisibility(View.GONE);

        eColor1.setVisibility(View.GONE);
        eColor2.setVisibility(View.GONE);
        eColor3.setVisibility(View.GONE);
        eColor4.setVisibility(View.GONE);
        eColor5.setVisibility(View.GONE);
        eColor6.setVisibility(View.GONE);
        eColor7.setVisibility(View.GONE);
        eColor8.setVisibility(View.GONE);
        eColor9.setVisibility(View.GONE);
        eColor10.setVisibility(View.GONE);
        eColor11.setVisibility(View.GONE);
        eColor12.setVisibility(View.GONE);
        eColor13.setVisibility(View.GONE);
        eColor14.setVisibility(View.GONE);
        eColor15.setVisibility(View.GONE);

        eC1.setVisibility(View.GONE);
        eC2.setVisibility(View.GONE);
        eC3.setVisibility(View.GONE);
        eC4.setVisibility(View.GONE);
        eC5.setVisibility(View.GONE);
        eC6.setVisibility(View.GONE);
        eC7.setVisibility(View.GONE);
        eC8.setVisibility(View.GONE);
        eC9.setVisibility(View.GONE);
        eC10.setVisibility(View.GONE);
        eC11.setVisibility(View.GONE);
        eC12.setVisibility(View.GONE);
        eC13.setVisibility(View.GONE);
        eC14.setVisibility(View.GONE);
        eC15.setVisibility(View.GONE);

        if(eSave.isPressed() == true) {
            Toast.makeText(AnkleDesign.this, "Saved", Toast.LENGTH_SHORT).show();
        }



        //COLOR BUTTONS
        eChangeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear

                ePattern1.setVisibility(View.GONE);
                ePattern2.setVisibility(View.GONE);
                ePattern3.setVisibility(View.GONE);
                ePattern4.setVisibility(View.GONE);
                ePattern5.setVisibility(View.GONE);
                ePattern6.setVisibility(View.GONE);
                ePattern7.setVisibility(View.GONE);
                ePattern8.setVisibility(View.GONE);
                ePattern9.setVisibility(View.GONE);
                ePattern10.setVisibility(View.GONE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);

                eChangeC.setVisibility(View.GONE);
                eChangeP.setVisibility(View.VISIBLE);
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);
            }
        });

        eColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eChangeC.setVisibility(View.GONE);
                eChangeP.setVisibility(View.VISIBLE);
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);
            }
        });

        eColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.VISIBLE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.VISIBLE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.VISIBLE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.VISIBLE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.VISIBLE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.VISIBLE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.VISIBLE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.VISIBLE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.VISIBLE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.VISIBLE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.VISIBLE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.VISIBLE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.VISIBLE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.VISIBLE);
                eC15.setVisibility(View.GONE);
            }
        });

        eColor15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eColor1.setVisibility(View.VISIBLE);
                eColor2.setVisibility(View.VISIBLE);
                eColor3.setVisibility(View.VISIBLE);
                eColor4.setVisibility(View.VISIBLE);
                eColor5.setVisibility(View.VISIBLE);
                eColor6.setVisibility(View.VISIBLE);
                eColor7.setVisibility(View.VISIBLE);
                eColor8.setVisibility(View.VISIBLE);
                eColor9.setVisibility(View.VISIBLE);
                eColor10.setVisibility(View.VISIBLE);
                eColor11.setVisibility(View.VISIBLE);
                eColor12.setVisibility(View.VISIBLE);
                eColor13.setVisibility(View.VISIBLE);
                eColor14.setVisibility(View.VISIBLE);
                eColor15.setVisibility(View.VISIBLE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.VISIBLE);
            }
        });

        //PATTERN BUTTONS
        eChangeP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear

                eColor1.setVisibility(View.GONE);
                eColor2.setVisibility(View.GONE);
                eColor3.setVisibility(View.GONE);
                eColor4.setVisibility(View.GONE);
                eColor5.setVisibility(View.GONE);
                eColor6.setVisibility(View.GONE);
                eColor7.setVisibility(View.GONE);
                eColor8.setVisibility(View.GONE);
                eColor9.setVisibility(View.GONE);
                eColor10.setVisibility(View.GONE);
                eColor11.setVisibility(View.GONE);
                eColor12.setVisibility(View.GONE);
                eColor13.setVisibility(View.GONE);
                eColor14.setVisibility(View.GONE);
                eColor15.setVisibility(View.GONE);

                eC1.setVisibility(View.GONE);
                eC2.setVisibility(View.GONE);
                eC3.setVisibility(View.GONE);
                eC4.setVisibility(View.GONE);
                eC5.setVisibility(View.GONE);
                eC6.setVisibility(View.GONE);
                eC7.setVisibility(View.GONE);
                eC8.setVisibility(View.GONE);
                eC9.setVisibility(View.GONE);
                eC10.setVisibility(View.GONE);
                eC11.setVisibility(View.GONE);
                eC12.setVisibility(View.GONE);
                eC13.setVisibility(View.GONE);
                eC14.setVisibility(View.GONE);
                eC15.setVisibility(View.GONE);

                eChangeC.setVisibility(View.VISIBLE);
                eChangeP.setVisibility(View.GONE);
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);
            }
        });

        ePattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                eChangeC.setVisibility(View.VISIBLE);
                eChangeP.setVisibility(View.GONE);
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);
            }
        });

        ePattern1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.VISIBLE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.VISIBLE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.VISIBLE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.VISIBLE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.VISIBLE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.VISIBLE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.VISIBLE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.VISIBLE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.VISIBLE);
                eP10.setVisibility(View.GONE);
            }
        });

        ePattern10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePattern.setVisibility(View.GONE);//makes it disappear
                eColor.setVisibility(View.GONE);//makes it disappear
                ePattern1.setVisibility(View.VISIBLE);
                ePattern2.setVisibility(View.VISIBLE);
                ePattern3.setVisibility(View.VISIBLE);
                ePattern4.setVisibility(View.VISIBLE);
                ePattern5.setVisibility(View.VISIBLE);
                ePattern6.setVisibility(View.VISIBLE);
                ePattern7.setVisibility(View.VISIBLE);
                ePattern8.setVisibility(View.VISIBLE);
                ePattern9.setVisibility(View.VISIBLE);
                ePattern10.setVisibility(View.VISIBLE);

                eP1.setVisibility(View.GONE);
                eP2.setVisibility(View.GONE);
                eP3.setVisibility(View.GONE);
                eP4.setVisibility(View.GONE);
                eP5.setVisibility(View.GONE);
                eP6.setVisibility(View.GONE);
                eP7.setVisibility(View.GONE);
                eP8.setVisibility(View.GONE);
                eP9.setVisibility(View.GONE);
                eP10.setVisibility(View.VISIBLE);
            }
        });




        //BASIC BOTTOM NAVIGATION
        eHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnkleDesign.this, HomeScreen.class);
                startActivity(intent);
            }
        });

        eAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnkleDesign.this, Account.class);
                startActivity(intent);
            }
        });

        eShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnkleDesign.this, Share.class);
                startActivity(intent);
            }
        });
    }
}