package com.example.fitpedia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChestexAdapter extends ArrayAdapter<Product2> {

    private final Context context2;
    private final ArrayList<Product2> values;

    public ChestexAdapter(Context context, ArrayList<Product2> list2) {
        super(context,R.layout.row_layout, list2);
        this.context2 = context;
        this.values = list2;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView tvprod = (TextView) rowView.findViewById(R.id.tvprod);
        ImageView prod = (ImageView) rowView.findViewById(R.id.prod);

        tvprod.setText(values.get(position).getTitle());

        if (values.get(position).getType().equals("ex1"))
        {
            prod.setImageResource(R.drawable.picture);
        }
        else if (values.get(position).getType().equals("ex2"))
        {
            prod.setImageResource(R.drawable.picture);
        }
        else if (values.get(position).getType().equals("ex3"))
        {
            prod.setImageResource(R.drawable.sandu);
        }

        return rowView;
    }
}
