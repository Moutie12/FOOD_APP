package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    Button register ;
    EditText username , email , password ,adresse ;

    public void pass_to_login1(View V)
    {
        startActivity(new Intent(this,login.class));
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username = findViewById(R.id.username);
        email = findViewById(R.id.modify_email);
        password = findViewById(R.id.modify_password);
        adresse = findViewById(R.id.adresse);
        register = (Button) findViewById(R.id.login);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlite myDB = new sqlite(signup.this);
                myDB.addBook(username.getText().toString(),email.getText().toString(),password.getText().toString(),adresse.getText().toString());
                Toast.makeText(signup.this, "inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}