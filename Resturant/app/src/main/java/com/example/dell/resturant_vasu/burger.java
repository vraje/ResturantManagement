package com.example.dell.resturant_vasu;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class burger extends ListActivity {
    static final String[] arr1 = new String[]{"Chicken Burger@Rs25", "Cheese Burger@Rs25", "Veg Burger@Rs25", "Extra Cheese Burger@Rs25", "Aloo Tikki Burger@Rs25"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_burger);
        setListAdapter(new custom(this, arr1));
    }
    protected void onListItemClick (ListView l, View v, int position, long id)
    {
        String selected = (String) getListAdapter().getItem(position);
        AlertDialog.Builder build = new AlertDialog.Builder(burger.this);
        build.setTitle("Choose");
        build.setMessage("Want to place Order or add to Cart??");
        build.setPositiveButton("Cart", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Intent j=new Intent(burger.this,cart.class);
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