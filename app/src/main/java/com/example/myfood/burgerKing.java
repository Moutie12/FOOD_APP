package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class burgerKing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_king);
    }
    public void addOrder20(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("CHEDDAR LOVER",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder21(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("CHICKEN CHEDDAR LOVER",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder22(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("EXTRA CHEDDAR",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder23(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("CRISPY CHICKEN",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder24(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("Veggie Whopper",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder25(View v)
    {
        sqlite myDB = new sqlite(burgerKing.this);
        myDB.addOrder("KING WINGS",profil.username);
        Toast.makeText(burgerKing.this, "order added", Toast.LENGTH_SHORT).show();
    }
}