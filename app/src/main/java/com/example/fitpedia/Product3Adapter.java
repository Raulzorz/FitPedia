package com.example.fitpedia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Product3Adapter extends RecyclerView.Adapter<Product3Adapter.ViewHolder> {

    private ArrayList<Product3> items;

    public Product3Adapter (Context context, ArrayList<Product3> List)
    {
        items = List;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView prod;
        TextView tvprod;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvprod = itemView.findViewById(R.id.tvprod);
            prod = itemView.findViewById(R.id.prod);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Product3Adapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(items.get(i));

        viewHolder.tvprod.setText(items.get(i).getTitle());

        if (items.get(i).getType().equals("ex1"))
        {
            viewHolder.prod.setImageResource(R.drawable.scale);
        }
        else
        {
            if(items.get(i).getType().equals("ex2")) {
                viewHolder.prod.setImageResource(R.drawable.legs);
            }
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
