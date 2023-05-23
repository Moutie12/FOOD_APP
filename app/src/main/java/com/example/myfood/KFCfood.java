package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class KFCfood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfcfood);
    }
    public void addOrder30(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("CHEDDAR LOVER",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder31(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("CHICKEN CHEDDAR LOVER",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder32(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("EXTRA CHEDDAR",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder33(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("CRISPY CHICKEN",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder34(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("Veggie Whopper",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder35(View v)
    {
        sqlite myDB = new sqlite(KFCfood.this);
        myDB.addOrder("KING WINGS",profil.username);
        Toast.makeText(KFCfood.this, "order added", Toast.LENGTH_SHORT).show();
    }
}