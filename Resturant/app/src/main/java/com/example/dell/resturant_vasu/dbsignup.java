package com.example.dell.resturant_vasu;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dell on 8/5/2017.
 */

public class dbsignup extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "RESTURANT";
    private static final String TABLE_NAME = "USER";
    private static final int DATABASE_VERSION = 1;
    private static final String NAME = "Name";
    private static final String UNAME = "UName";
    private static final String ID = "id";
    private static final String EMAIL = "Email";
    private static final String PASSWORD = "Password";
    public dbsignup(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+" ("
                +ID+" INTEGER AUTO INCREMENT NOT NULL,"
                +NAME+" TEXT NOT NULL,"
                +UNAME+" TEXT PRIMARY KEY,"
                +EMAIL+" TEXT NOT NULL,"
                +PASSWORD+" TEXT NOT NULL"+")";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTED " +TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
    public  long addUser(user user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME, user.getName());
        contentValues.put(UNAME,user.getUsername());
        contentValues.put(EMAIL,user.getEmail());
        contentValues.put(PASSWORD, user.getPassword());
        long rowid = db.insert(TABLE_NAME, null, contentValues);
        return rowid;
    }
    public  user getUser(String name,String userName,String email,String passWord)
    {
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.query(TABLE_NAME, new String[]{ID, NAME, UNAME, EMAIL, PASSWORD},
                UNAME+"=?", new String[]{userName},null,null,null,null);
        if(cursor != null)
        {
            cursor.moveToFirst();
        }
        user user=new user(cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4));
        return user;
    }
}