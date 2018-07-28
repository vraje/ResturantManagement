package com.example.dell.resturant_vasu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {
TextView tv9,tv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv9=(TextView)findViewById(R.id.tv9);
        tv8=(TextView)findViewById(R.id.tv8);
        registerForContextMenu(tv8);
        Intent i3=getIntent();
      String str1 =  i3.getStringExtra("name");
        StringBuilder sb=new StringBuilder("WELCOME"+"     "+str1);
        tv9.setText(sb);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // return super.onCreateOptionsMenu(menu);
        menu.add("HOME");
        menu.add("MY ORDER");
        menu.add("CART");
        menu.add("MENU CATEGORIES");
        menu.add("LOG OUT");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
       if(item.getTitle().equals("HOME"))
       {
           Intent i5=new Intent(menu.this,menu.class);
           startActivity(i5);
       }
       else
       if(item.getTitle().equals("MY ORDER"))
       {
           Intent i5=new Intent(menu.this,menu.class);
           startActivity(i5);
       }
       else
       if(item.getTitle().equals("CART"))
       {
           Intent i5=new Intent(menu.this,cart.class);
           startActivity(i5);
       }
       else
       if(item.getTitle().equals("MENU CATEGORIES"))
       {
           Intent i5=new Intent(menu.this,menucategory.class);
           startActivity(i5);
       }
       else
       if(item.getTitle().equals("LOG OUT"))
       {
           Intent i5=new Intent(menu.this,login.class);
           startActivity(i5);
       }
        return true;
    }
}