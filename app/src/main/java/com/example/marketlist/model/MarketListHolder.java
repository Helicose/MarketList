package com.example.marketlist.model;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketlist.R;


public class MarketListHolder extends RecyclerView.ViewHolder {

    public CardView mCardView;
    public TextView mName;
    public TextView mAdress;
    public Context context;



    public MarketListHolder(@NonNull View itemView) {
        super(itemView);

        //link with layout
        mCardView = itemView.findViewById(R.id.activity_main_cardView);
        mName = itemView.findViewById(R.id.activity_main_item_name);
        mAdress = itemView.findViewById(R.id.activity_main_item_adress);
        context = itemView.getContext();

    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public TextView getName() {
        return mName;
    }

    public void setName(TextView name) {
        this.mName = name;
    }

    public TextView getAdress() {
        return mAdress;
    }

    public void setAdress(TextView adress) {
        this.mAdress = adress;
    }

}

