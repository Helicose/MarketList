package com.example.marketlist.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketlist.R;

import java.util.List;



public class MarketListAdapter extends RecyclerView.Adapter {

    public MarketList mMarketList;
    public MarketListHolder vh;

    public MarketListAdapter(MarketList marketList){

        mMarketList=marketList;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate (R.layout.activity_main_item, parent, false);

        vh = new MarketListHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        vh.name.setText(mMarketList.getMarketList().get(position).getName());
        vh.adress.setText(mMarketList.getMarketList().get(position).getAdress());

    }

    @Override
    public int getItemCount() {
        return mMarketList.getMarketList().size();
    }
}
