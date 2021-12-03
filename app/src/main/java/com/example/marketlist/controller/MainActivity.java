package com.example.marketlist.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.marketlist.R;
import com.example.marketlist.model.Market;
import com.example.marketlist.model.MarketList;
import com.example.marketlist.model.MarketListAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    MarketListAdapter mMarketListAdapter;
    MarketList mMarketList;

    CardView mCardView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mCardView = findViewById(R.id.main_activity_cardView);

        //Prepare data
        mMarketList = new MarketList();
        mMarketList = marketGenerator();

        //Instantiate adapter
        mMarketListAdapter = new MarketListAdapter(mMarketList);

        //set Main view
        setContentView(R.layout.activity_main);

        //Get recycle layout
        mRecyclerView = findViewById(R.id.main_activity_recycle_view);
        
        //Plug adapter into RecycleView
        mRecyclerView.setAdapter(mMarketListAdapter);

        mLayoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    private MarketList marketGenerator(){
        //Prepare Market List
        MarketList mMarketList;
        Market mMarket1;
        Market mMarket2;
        Market mMarket3;
        Market mMarket4;
        Market mMarket5;
        Market mMarket6;
        Market mMarket7;
        Market mMarket8;
        Market mMarket9;

        mMarket1= new Market(1, "Carrefour", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket2= new Market(2, "Leclerc", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket3= new Market(3, "Intermarché", "Rte de Nantes 56860 Séné", "0800000000","France" );
        mMarket4= new Market(4, "Carrefour", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket5= new Market(5, "Leclerc", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket6= new Market(6, "Intermarché", "Rte de Nantes 56860 Séné", "0800000000","France" );
        mMarket7= new Market(7, "Carrefour", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket8= new Market(8, "Leclerc", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket9= new Market(9, "Intermarché", "Rte de Nantes 56860 Séné", "0800000000","France" );

        mMarketList = new MarketList(Arrays.asList(mMarket1,mMarket2,mMarket3,mMarket4,mMarket5,mMarket6,mMarket7,mMarket8,mMarket9));
        return mMarketList;

    }
}