package com.example.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
    }
    public void back_to_profil(View V)
    {
        startActivity(new Intent(this,profil.class));
    }
    public void pass_to_star(View v)
    {
        startActivity(new Intent(this,starbucks_menu.class));
    }
    public void pass_to_mac(View v)
    {
        startActivity(new Intent(this,Mac_menu.class));
    }
    public void pass_to_whataburger(View v)
    {
        startActivity(new Intent(this,whataburger.class));
    }
    public void pass_to_taco(View v)
    {
        startActivity(new Intent(this,taco.class));
    }
    public void pass_to_burger_king(View v)
    {
        startActivity(new Intent(this,burgerKing.class));
    }
    public void pass_to_KFCfood(View v)
    {
        startActivity(new Intent(this,KFCfood.class));
    }
    public void pass_to_louis(View v)
    {
        startActivity(new Intent(this,LeLouisXV.class));
    }
    public void pass_to_larpege(View v)
    {
        startActivity(new Intent(this,larpege.class));
    }
    public void pass_to_Mirazur(View v)
    {
        startActivity(new Intent(this,Mirazur.class));
    }
    public void pass_to_Fresh(View v)
    {
        startActivity(new Intent(this,TheFrenchLaundry.class));
    }
    public void pass_to_Eleven(View v)
    {
        startActivity(new Intent(this,ElevenMadison.class));
    }
    public void pass_to_Clarence(View v)
    {
        startActivity(new Intent(this,LeClarence.class));
    }

    public void addResto1(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("WhatABurger",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto2(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("McDonald's",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto3(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Taco Bell",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto4(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("StarBucks",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto5(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Burger King",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto6(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("KFC food",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto7(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("The French Laundry",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto8(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Mirazur",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto9(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Eleven Madison",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto10(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Le Louis XV",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto11(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("Le Clarence",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
    public void addResto12(View v)
    {
        sqlite myDB = new sqlite(Restaurants.this);
        myDB.addFavourite("l'arpège",profil.username);
        Toast.makeText(Restaurants.this, "added", Toast.LENGTH_SHORT).show();
    }
}