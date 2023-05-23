package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mac_menu extends AppCompatActivity {


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac_menu);
    }
    public void addOrder1(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("BigMac",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder2(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("Double BigMac",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder3(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("Royal Crispy",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder4(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("Cheese burger",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder5(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("Filet-O-Fish",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder6(View v)
    {
        sqlite myDB = new sqlite(Mac_menu.this);
        myDB.addOrder("Caffè Latte",profil.username);
        Toast.makeText(Mac_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
}