package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button login ;
    EditText email , password ;
    private Boolean result ;

    public void pass_to_signup(View V) {
        startActivity(new Intent(this,signup.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.modify_email);
        password = findViewById(R.id.modify_password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlite myDB = new sqlite(login.this);
                result = myDB.checklogin(email.getText().toString().trim(), password.getText().toString().trim());
                if (result) {
                    Toast.makeText(login.this, "data founded", Toast.LENGTH_SHORT).show();
                    profil.email = email.getText().toString() ;
                    profil.password = password.getText().toString() ;
                    profil.username = myDB.recherche_username(email.getText().toString(),password.getText().toString());
                    profil.adresse = myDB.recherche_adresse(email.getText().toString(),password.getText().toString());
                    startActivity(new Intent(login.this,profil.class));
                } else {
                    Toast.makeText(login.this, "data unfounded", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}