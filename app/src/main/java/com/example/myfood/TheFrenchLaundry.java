package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TheFrenchLaundry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_french_laundry);
    }
    public void addOrder80(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("oysters and pearls",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder81(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("royal ossetra",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder82(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("salad of summer melon",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder83(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("tomme de savoie",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder84(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("chocolate pudding pie",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder85(View v)
    {
        sqlite myDB = new sqlite(TheFrenchLaundry.this);
        myDB.addOrder("strawberry and custard dessert",profil.username);
        Toast.makeText(TheFrenchLaundry.this, "order added", Toast.LENGTH_SHORT).show();
    }
}