package com.example.marketlist.model;

import java.io.Serializable;
import java.util.List;

public class MarketList implements Serializable {

    private List<Market> mMarketList;
    private int index;

    public MarketList(){

    }

    public MarketList(List<Market> marketList){
        mMarketList = marketList;
    }

    public List<Market> getMarketList() {
        return mMarketList;
    }

    public void setMarketList(List<Market> marketList) {
        mMarketList = marketList;
    }

}
