package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Mirazur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirazur);
    }
    public void addOrder36(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("Little Italy",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder37(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("Menu entier",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder38(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("Gusto Sapori del Vicoletto",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder39(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("Pizza La Frontiere",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder40(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("Le Bonzai",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder41(View v)
    {
        sqlite myDB = new sqlite(Mirazur.this);
        myDB.addOrder("La Galetiere",profil.username);
        Toast.makeText(Mirazur.this, "order added", Toast.LENGTH_SHORT).show();
    }
}