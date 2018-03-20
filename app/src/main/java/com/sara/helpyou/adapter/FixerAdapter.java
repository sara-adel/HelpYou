package com.sara.helpyou.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sara.helpyou.ItemClickListener;
import com.sara.helpyou.Model.Data;
import com.sara.helpyou.R;

import java.util.ArrayList;

/**
 * Created by sara on 3/20/2018.
 */

public class FixerAdapter extends RecyclerView.Adapter<FixerAdapter.FixerViewHolder> {

    Context context;
    ArrayList<Data> data;
    ItemClickListener itemClickListener;

    public FixerAdapter(Context context,  ArrayList<Data> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public FixerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fixer_list, parent, false);
        return new FixerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FixerViewHolder holder, int position) {

        holder.name.setText(data.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class FixerViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name;

        public FixerViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.fixer_image);
            name = itemView.findViewById(R.id.fixer_name);
        }
    }

    public void setItemClickLister(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

}
