package com.example.marketlist.model;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketlist.R;
import com.example.marketlist.controller.MainActivity;
import com.example.marketlist.controller.MarketActivity;

public class MarketListHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView adress;


    public MarketListHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Afficher la vue MarketActivity

            }
        });


        name = itemView.findViewById(R.id.activity_main_item_name);
        adress = itemView.findViewById(R.id.activity_main_item_adress);
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getAdress() {
        return adress;
    }

    public void setAdress(TextView adress) {
        this.adress = adress;
    }
}
