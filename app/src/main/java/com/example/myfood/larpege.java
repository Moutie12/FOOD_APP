package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class larpege extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larpege);
    }
    public void addOrder66(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Torche aux châtaignes",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder67(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Macaron au topinambour",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder68(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Tarte aux pommes",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder69(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Millefeuille croustillant",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder70(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Soufflé au pralin",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder71(View v)
    {
        sqlite myDB = new sqlite(larpege.this);
        myDB.addOrder("Carré d’agneau grillé",profil.username);
        Toast.makeText(larpege.this, "order added", Toast.LENGTH_SHORT).show();
    }
}