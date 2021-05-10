package com.example.onestar_design;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static String user;
    static String pass;

    private EditText eUsername;
    private EditText ePassword;
    private Button eLogin;

    boolean isValidInputU = false;
    boolean isValidInputP = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername = (EditText) findViewById((R.id.username));
        ePassword = (EditText) findViewById((R.id.password));
        eLogin = findViewById(R.id.login);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = eUsername.getText().toString();
                String inputPassword = ePassword.getText().toString();


                if(inputName.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter email and/or" +
                                                            " password", Toast.LENGTH_SHORT).show();
                } else {
                    isValidInputU = validateUser();
                    isValidInputP = validatePass();

                    if (!isValidInputP && !isValidInputU) {
                        Toast.makeText(MainActivity.this, "Invalid Email and Password",
                                                                Toast.LENGTH_SHORT).show();
                    }
                    else if (!isValidInputU) {
                        Toast.makeText(MainActivity.this, "Invalid Email",
                                                                    Toast.LENGTH_SHORT).show();
                    } else if (!isValidInputP) {
                        Toast.makeText(MainActivity.this, "Password must be more than " +
                                                        "5 characters", Toast.LENGTH_SHORT).show();
                    } else {
                        user = inputName;
                        pass = inputPassword;
                        Toast.makeText(MainActivity.this, "Login Successful",
                                Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, LogoScreen.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean validateUser(){
        // checking the proper email format
        if (!isEmailValid(eUsername.getText().toString())) {
            return false;
        }
        return true;
    }

    private boolean validatePass(){
        // checking minimum password Length
        if (ePassword.getText().length() < 5) {
            return false;
        }
        return true;
    }

    public static String getUser(){
        return user;
    }

    public static String getPass(){
        return pass;
    }
}