package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class taco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taco);
    }
    public void addOrder01(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Soft Taco",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder02(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Cheesy Roll Up",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder03(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Quesarito",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder04(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Nachos BellGrande",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder05(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Chicken Quesadilla",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder06(View v)
    {
        sqlite myDB = new sqlite(taco.this);
        myDB.addOrder("Cheesy Fiesta",profil.username);
        Toast.makeText(taco.this, "order added", Toast.LENGTH_SHORT).show();
    }
}