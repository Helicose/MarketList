package com.example.marketlist.model;

import java.io.Serializable;
import java.util.List;

public class MarketList implements Serializable {

    public static List<Market> mMarketList;

    public MarketList(List<Market> marketList){
        mMarketList = marketList;
    }

    public MarketList(MarketList marketList){
        mMarketList = marketList.getMarketList();
    }

    public MarketList(){

    }

    public static List<Market> getMarketList() {
        return mMarketList;
    }

    public void setMarketList(List<Market> marketList) {
        mMarketList = marketList;
    }

}
