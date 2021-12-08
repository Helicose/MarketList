package com.example.marketlist.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketlist.R;
import com.example.marketlist.controller.MarketActivity;


public class MarketListAdapter extends RecyclerView.Adapter {

    public MarketList mMarketList;
    public MarketListHolder vh;
    public Context context;

    public MarketListAdapter(MarketList marketList){

        mMarketList=marketList;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate (R.layout.activity_main_item, parent, false);

        context = parent.getContext();

        vh = new MarketListHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        vh.mName.setText(mMarketList.getMarketList().get(position).getName());
        vh.mAdress.setText(mMarketList.getMarketList().get(position).getAdress());

        //Listener on CardViews to open Market details
        vh.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marketActivityIntent = new Intent(context, MarketActivity.class);
                marketActivityIntent.putExtra("position",position);
                context.startActivity(marketActivityIntent);
                System.out.println(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mMarketList.getMarketList().size();
    }
}
