package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText loginView,passView;
    Button loginBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginView=findViewById(R.id.username);
        passView=findViewById(R.id.password);
        loginBTN=findViewById(R.id.login);
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        loginBTN.setOnClickListener(m->{
            if(loginView.getText().toString().equals("mead")&&passView.getText().toString().equals("123456")){
                Intent intent2=new Intent(this,MainActivity.class);
                startActivity(intent2);
            }
        });
    }

}