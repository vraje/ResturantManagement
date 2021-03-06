package com.example.dell.resturant_vasu;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class noodles extends ListActivity {
    static final String[] arr1 = new String[]{"Curry Noodles@Rs25", "Rice Noodles@Rs25", "Egg Noodles@Rs25", "Veg Noodles@Rs25", "Masala Noodles@Rs25"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.noodles);
        setListAdapter(new custom(this, arr1));
    }

        @Override
        protected void onListItemClick (ListView l, View v,int position, long id)
        {
                String selected = (String) getListAdapter().getItem(position);
            AlertDialog.Builder build = new AlertDialog.Builder(noodles.this);
            build.setTitle("Choose");
            build.setMessage("Want to place Order or add to Cart??");
            build.setPositiveButton("CART", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                   Intent j=new Intent(noodles.this,cart.class);
                    startActivity(j);
                }

            });
            build.setNegativeButton("PLACE ORDER", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            AlertDialog myalert = build.create();
            myalert.show();

        }
    }
