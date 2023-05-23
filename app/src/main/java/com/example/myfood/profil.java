package com.example.myfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class profil extends AppCompatActivity {
    public static String email ;
    public static String password ;
    public static String username ;
    public static String adresse ;
    BottomNavigationView nav ;
    private void pass_to_profil() {
        startActivity(new Intent(this,profil.class));
    }
    private void pass_to_setting() {
        startActivity(new Intent(this,Setting.class));
    }
    public void pass_to_resto(View V)
    {
        startActivity(new Intent(this,Restaurants.class));
    }
    public void pass_to_orders()
    {
        startActivity(new Intent(this,orders.class));
    }
    public void pass_to_favorite()
    {
        startActivity(new Intent(this,favorite.class));
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        ((TextView) findViewById(R.id.whoamI)).setText("Hi "+profil.username);
        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                        break;
                    case R.id.favorites:
                        pass_to_favorite();
                        break;
                    case R.id.orders:
                        pass_to_orders();
                        break;
                    case R.id.settings:
                        pass_to_setting();
                        break;
                }
                return false;
            }
    });
}
}