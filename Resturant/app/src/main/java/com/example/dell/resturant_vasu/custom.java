package com.example.dell.resturant_vasu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dell on 7/28/2017.
 */

public class custom extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public custom(@NonNull Context context, String[] values) {
        super(context, R.layout.custom_list, values);
        this.context = context;
        this.values = values;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView =  inflater.inflate(R.layout.custom_list, parent, false);
        ImageView img = (ImageView)rowView.findViewById(R.id.image);
        TextView txt = (TextView)rowView.findViewById(R.id.tv);
        txt.setText(values[position]);
        String s = values[position];
        System.out.println(s);
        if(s.equals("Curry Noodles@Rs25")) {
            img.setImageResource(R.drawable.n);

        } else if (s.equals("Rice Noodles@Rs25")) {
            img.setImageResource(R.drawable.n);

        } else if (s.equals("Egg Noodles@Rs25")) {
            img.setImageResource(R.drawable.n);

        } else
            if(s.equals("Veg Noodles@Rs25"))
            {
                img.setImageResource(R.drawable.n);

        }
            else
            if(s.equals("Masala Noodles@Rs25"))
            {
                img.setImageResource(R.drawable.n);
            }
            else
        if(s.equals("Chicken Burger@Rs25")) {
            img.setImageResource(R.drawable.burger);

        } else if (s.equals("Cheese Burger@Rs25")) {
            img.setImageResource(R.drawable.burger);

        } else if (s.equals("Veg Burger@Rs25")) {
            img.setImageResource(R.drawable.burger);

        } else
        if(s.equals("Extra Cheese Burger@Rs25"))
        {
            img.setImageResource(R.drawable.burger);

        }
        else
        if(s.equals("Aloo Tikki Burger@Rs25"))
        {
            img.setImageResource(R.drawable.burger);

        }
        else
        if(s.equals("Walnut Salad@Rs25")) {
            img.setImageResource(R.drawable.saladpic);

        } else if (s.equals("Strawberry Salad@Rs25")) {
            img.setImageResource(R.drawable.saladpic);

        } else if (s.equals("Greek Salad@Rs25")) {
            img.setImageResource(R.drawable.saladpic);

        } else
        if(s.equals("Pasta Salad@Rs25"))
        {
            img.setImageResource(R.drawable.saladpic);

        }
        else
        if(s.equals("Spinach Salad@Rs25"))
        {
            img.setImageResource(R.drawable.saladpic);

        }
        else
        if(s.equals("Chocolate Milkshake@Rs25")) {
            img.setImageResource(R.drawable.shakes);
        } else if (s.equals("Cold Coffee@Rs25")) {
            img.setImageResource(R.drawable.shakes);
        } else if (s.equals("Icecream Shake@Rs25")) {
            img.setImageResource(R.drawable.shakes);

        } else

        if(s.equals("Yummy Milkshake@Rs25"))
        {
            img.setImageResource(R.drawable.shakes);

        }
        else
        if(s.equals("Vanilla Shake@Rs25"))
        {
            img.setImageResource(R.drawable.shakes);
        }
        return rowView;
    }
}
