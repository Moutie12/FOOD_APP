package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pass_to_login(View V)
    {
        startActivity(new Intent(this,Articles.class));
    }
    public void pass_to_profil(View V)
    {
        startActivity(new Intent(this,profil.class));
    }
    public void pass_to_login1(View V) {
        startActivity(new Intent(this,login.class));
    }
}