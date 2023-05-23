package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class starbucks_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbucks_menu);
    }
    public void addOrder7(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Americano",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder8(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Mocha",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder9(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Iced Vanilla Espresso",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder10(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Ristretto Bianco",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder11(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Caramel Macchiato",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder12(View v)
    {
        sqlite myDB = new sqlite(starbucks_menu.this);
        myDB.addOrder("Caffè Latte",profil.username);
        Toast.makeText(starbucks_menu.this, "order added", Toast.LENGTH_SHORT).show();
    }
}