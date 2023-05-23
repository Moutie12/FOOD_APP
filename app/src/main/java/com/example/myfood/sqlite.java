package com.example.myfood;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class sqlite extends SQLiteOpenHelper {
    private Context context ;
    private static final String TABLE_ID="id" ;
    private static final String TABLE_NAME="utilisateur1" ;
    private static final String TABLE_NAME1="commande" ;
    private static final String TABLE_NAME2="favourite" ;
    private static final String COLUMN_NAME="food_name" ;
    private static final String COLUMN_NAME2="resto_name" ;
    private static final String COLUMN_USERNAME="username" ;
    private static final String COLUMN_EMAIL="email" ;
    private static final String COLUMN_PASSWORD="password" ;
    private static final String COLUMN_ADR="adresse" ;

    private static final String COLUMN_RestoName="resto_Name" ;

    public sqlite(@Nullable Context context) {
        super(context, "myfood.db", null, 1);
        this.context = context ;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_NAME+"("+TABLE_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_USERNAME+ " TEXT, "+COLUMN_EMAIL+ " TEXT ," + COLUMN_PASSWORD + " TEXT ,"+COLUMN_ADR+ " TEXT)";
        db.execSQL(query);
        String query1 = "CREATE TABLE "+TABLE_NAME1+"("+TABLE_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_NAME+ " TEXT, "+COLUMN_USERNAME+" TEXT)";
        db.execSQL(query1);
        String query2 = "CREATE TABLE "+TABLE_NAME2+"("+TABLE_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_NAME2+ " TEXT, "+COLUMN_USERNAME+" TEXT)";
        db.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db);
    }
    void addBook(String username,String email,String password,String address){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues() ;
        cv.put(COLUMN_USERNAME,username);
        cv.put(COLUMN_EMAIL,email);
        cv.put(COLUMN_PASSWORD,password);
        cv.put(COLUMN_ADR,address);
        long result = db.insert(TABLE_NAME,null, cv);
        if (result != -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
        }
    }
    void addOrder(String name_food,String user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues() ;
        cv.put(COLUMN_NAME,name_food);
        cv.put(COLUMN_USERNAME,user);
        long result = db.insert(TABLE_NAME1,null, cv);
        if (result != -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
        }
    }
    void addFavourite(String nameresto,String user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues() ;
        cv.put(COLUMN_NAME2,nameresto);
        cv.put(COLUMN_USERNAME,user);
        long result = db.insert(TABLE_NAME2,null, cv);
        if (result != -1) {
            Toast.makeText(context, "Failed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show();
        }
    }
    public Cursor ReadAllData(String user){
        String query = "SELECT * FROM " + TABLE_NAME1 + " WHERE username='" + user + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null ;
        if (db != null)
        {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    public Cursor ReadAllData1(String user){
        String query = "SELECT * FROM " + TABLE_NAME2 + " WHERE username='" + user + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null ;
        if (db != null)
        {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }


    public Boolean checklogin (String name , String pass )
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from utilisateur1 where email = ? and password = ? ",new String[] {name,pass});
        if (cursor.getCount() > 0)
        {
            return true ;
        }else{
            return false;
        }
    }
    @SuppressLint("Range")
    public String recherche_username(String name , String pass)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select username from utilisateur1 where email = ? and password = ? ",new String[] {name,pass});
        String username = null;
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            username = cursor.getString(cursor.getColumnIndex("username"));
        }
        cursor.close();
        db.close();

        return username;
    }
    @SuppressLint("Range")
    public String recherche_adresse(String name , String pass)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select adresse from utilisateur1 where email = ? and password = ? ",new String[] {name,pass});
        String adresse = null;
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            adresse = cursor.getString(cursor.getColumnIndex("adresse"));
        }
        cursor.close();
        db.close();

        return adresse;
    }
}

