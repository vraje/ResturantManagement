package com.example.dell.resturant_vasu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dell on 8/5/2017.
 */

public class dbcart extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "CART";
    private static final String TABLE_NAME = "ITEM";
    private static final int DATABASE_VERSION = 1;
    private static final String ID = "id";
    private static final String FIRST_NAME = "fname";
    private static final String ITEM = "item";
    public dbcart(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
                + ID + " INTEGER AUTO INCREMENT,"
                + FIRST_NAME + " TEXT,"
                + ITEM + " TEXT NOT NULL" + ")";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public long addUser(usercart user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FIRST_NAME, user.getFname());
        contentValues.put(ITEM, user.getItem());
        long rowid = db.insert(TABLE_NAME, null, contentValues);
        return rowid;
    }
}
