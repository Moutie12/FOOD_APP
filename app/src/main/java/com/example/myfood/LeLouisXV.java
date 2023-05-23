package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LeLouisXV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_louis_xv);
    }
    public void addOrder43(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("chilled langoustines",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder44(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("simmered gobbo",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder45(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("Provence Garden Cafe",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder46(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("Bacon and Egg Roll",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder47(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("fresh and matured cheeses",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder48(View v)
    {
        sqlite myDB = new sqlite(LeLouisXV.this);
        myDB.addOrder("Cheesy Fiesta",profil.username);
        Toast.makeText(LeLouisXV.this, "order added", Toast.LENGTH_SHORT).show();
    }
}