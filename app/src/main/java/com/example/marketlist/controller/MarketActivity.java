package com.example.marketlist.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marketlist.R;
import com.example.marketlist.model.MarketList;


public class MarketActivity extends Activity {

    public TextView mBlank;
    public TextView mTextViewName;
    public TextView mTextViewAdress;
    public TextView mTextViewPhone;
    public TextView mTextViewCountry;

    public MarketList mMarketList;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set Main view
        setContentView(R.layout.activity_market);

        mBlank = findViewById(R.id.activity_market_blank);
        mTextViewName = findViewById(R.id.activity_market_name);
        mTextViewAdress = findViewById(R.id.activity_market_adress);
        mTextViewPhone = findViewById(R.id.activity_market_phone);
        mTextViewCountry = findViewById(R.id.activity_market_country);

        mMarketList = new MarketList(mMarketList);

        Bundle extras = getIntent().getExtras();
        int mPosition = extras.getInt("position");

        //Toast.makeText(MarketActivity.this, "ID récupéré : " + mMarketList.getMarketList().get(extras.getInt("position")).getId(), Toast.LENGTH_LONG).show();

        mTextViewName.setText(mMarketList.getMarketList().get(mPosition).getName());
        mTextViewAdress.setText(mMarketList.getMarketList().get(mPosition).getAdress());
        mTextViewPhone.setText(mMarketList.getMarketList().get(mPosition).getPhone());
        mTextViewCountry.setText(mMarketList.getMarketList().get(mPosition).getCountry());

    }

}
