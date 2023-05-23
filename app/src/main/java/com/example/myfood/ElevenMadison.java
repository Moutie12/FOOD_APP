package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ElevenMadison extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven_madison);
    }
    public void addOrder50(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("plum Ginger soda",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder51(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("four story hill farm",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder52(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("mag and cheese",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder53(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("bread and butter",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder54(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("aptos farm kiwi",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
    public void addOrder55(View v)
    {
        sqlite myDB = new sqlite(ElevenMadison.this);
        myDB.addOrder("gougère",profil.username);
        Toast.makeText(ElevenMadison.this, "order added", Toast.LENGTH_SHORT).show();
    }
}