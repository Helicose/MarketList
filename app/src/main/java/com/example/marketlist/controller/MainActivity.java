package com.example.marketlist.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.marketlist.R;
import com.example.marketlist.model.Market;
import com.example.marketlist.model.MarketList;
import com.example.marketlist.model.MarketListAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public RecyclerView mRecyclerView;
    public RecyclerView.LayoutManager mLayoutManager;
    public static MarketListAdapter mMarketListAdapter;
    public static MarketList mMarketList;

    public FloatingActionButton mEditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set Main view
        setContentView(R.layout.activity_main);

        //Link Button
        mEditButton = findViewById(R.id.activity_main_new_market_button);

        //Click on button
        mEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editActivityIntent = new Intent(MainActivity.this, EditActivity.class);
                startActivity(editActivityIntent);
            }
        });

        //Prepare data
        mMarketList = new MarketList();
        mMarketList = marketGenerator();

        //Instantiate adapter
        mMarketListAdapter = new MarketListAdapter(mMarketList);

        //Get recycle layout
        mRecyclerView = findViewById(R.id.activity_main_recycle_view);
        
        //Plug adapter into RecycleView
        mRecyclerView.setAdapter(mMarketListAdapter);

        mLayoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    private MarketList marketGenerator(){
        //Prepare Market List
        MarketList mMarketList;
        List<Market> list;

        Market mMarket1;
        Market mMarket2;
        Market mMarket3;
        Market mMarket4;
        Market mMarket5;
        Market mMarket6;
        Market mMarket7;
        Market mMarket8;
        Market mMarket9;

        mMarket1= new Market(1, "Carrefour 1", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket2= new Market(2, "Leclerc 2", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket3= new Market(3, "Intermarché 3", "Rte de Nantes 56860 Séné", "0800000000","France" );
        mMarket4= new Market(4, "Carrefour 4", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket5= new Market(5, "Leclerc 5", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket6= new Market(6, "Intermarché 6", "Rte de Nantes 56860 Séné", "0800000000","France" );
        mMarket7= new Market(7, "Carrefour 7", "Parc de Kerlann 56000 Vannes", "0600000000","France" );
        mMarket8= new Market(8, "Leclerc 8", "Zone Commerciale De Parc Lann 56000 Vannes", "0700000000","France" );
        mMarket9= new Market(9, "Intermarché 9", "Rte de Nantes 56860 Séné", "0800000000","France" );

        list = Arrays.asList(mMarket1,mMarket2,mMarket3,mMarket4,mMarket5,mMarket6,mMarket7,mMarket8,mMarket9);

        //remove fixed-size constraint
        list = new ArrayList<>(list);

        mMarketList = new MarketList(list);
        return mMarketList;

    }
}