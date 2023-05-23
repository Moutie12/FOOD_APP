package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LeClarence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_clarence);
    }
    public void addOrder60(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("Quiche vichyssoise",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder61(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("soup du jour",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder62(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("Galette de poulet",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder63(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("Salade Nicoise",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder64(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("Boeuf Bourguignon",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder65(View v)
    {
        sqlite myDB = new sqlite(LeClarence.this);
        myDB.addOrder("Soupe du Jour",profil.username);
        Toast.makeText(LeClarence.this, "order added", Toast.LENGTH_SHORT).show();
    }
}