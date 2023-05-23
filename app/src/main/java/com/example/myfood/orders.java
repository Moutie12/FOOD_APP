package com.example.myfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class orders extends AppCompatActivity {
    sqlite db ;
    ArrayList<String> name_food , user , adresse;
    String user1 ;
    BottomNavigationView nav ;
    private void pass_to_profil() {
        startActivity(new Intent(this,profil.class));
    }
    private void pass_to_setting() {
        startActivity(new Intent(this,Setting.class));
    }
    public void pass_to_resto(View V)
    {
        startActivity(new Intent(this,Restaurants.class));
    }
    public void pass_to_orders()
    {
        startActivity(new Intent(this,orders.class));
    }
    public void pass_to_favorite()
    {
        startActivity(new Intent(this,favorite.class));
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        nav = findViewById(R.id.nav_bar);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home:
                        pass_to_profil();
                        break;
                    case R.id.favorites:
                        pass_to_favorite();
                        break;
                    case R.id.orders:
                        break;
                    case R.id.settings:
                        pass_to_setting();
                        break;
                }
                return false;
            }
        });

        db = new sqlite(orders.this);
        user = new ArrayList<>();
        name_food = new ArrayList<>();
        user1 = profil.username ;
        DisplayData(user1);

        RecyclerView ordersRecyclerView = findViewById(R.id.orders_recycler_view);
        ordersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        OrdersAdapter ordersAdapter = new OrdersAdapter(user, name_food);
        ordersRecyclerView.setAdapter(ordersAdapter);
    }


    void DisplayData(String user1) {
        Cursor cursor = db.ReadAllData1(user1);
        if (cursor.getCount() == 0)
        {
            Toast.makeText(this,"NO DATA",Toast.LENGTH_SHORT);
        }else{
            while (cursor.moveToNext())
            {
                name_food.add(cursor.getString(1));
                user.add(cursor.getString(0));
            }
        }
    }

}