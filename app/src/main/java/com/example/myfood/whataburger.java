package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class whataburger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whataburger);
    }
    public void addOrder13(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("French Fries",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder14(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("Avocado Burger",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder15(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("Breakfast Platter",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder16(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("Tray Of 6 Cinnamon",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder17(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("Cobb Salad",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder18(View v)
    {
        sqlite myDB = new sqlite(whataburger.this);
        myDB.addOrder("Malt",profil.username);
        Toast.makeText(whataburger.this, "order added", Toast.LENGTH_SHORT).show();
    }
}