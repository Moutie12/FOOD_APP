package com.example.myfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Setting extends AppCompatActivity {
    BottomNavigationView nav ;
    EditText email,password,username ;


    private void pass_to_profil() {
        startActivity(new Intent(this,profil.class));
    }
    private void pass_to_orderss() {
        startActivity(new Intent(this,orders.class));
    }
    private void pass_to_favor() {
        startActivity(new Intent(this,favorite.class));
    }
    private void pass_to_setting() {
        startActivity(new Intent(this,Setting.class));
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        nav = findViewById(R.id.nav_bar);
        email = findViewById(R.id.modify_email);
        password = findViewById(R.id.modify_password);
        username = findViewById(R.id.modify_username);
        email.setText(profil.email);
        password.setText(profil.password);
        username.setText(profil.username);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                        pass_to_profil();
                        break;
                    case R.id.favorites:
                        pass_to_favor();
                        break;

                    case R.id.orders:
                        pass_to_orderss();
                        break;
                    case R.id.settings:
                        break;
                }
                return false;
            }
        });
    }
}