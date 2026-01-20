package com.meridian.patterns.listener2;

import com.meridian.patterns.listener.Listener;

import java.util.ArrayList;
import java.util.List;

public class XTBStock {

    private List<ListenerMarket> listenerMarketList = new ArrayList<>();

    public void addListener(ListenerMarket listener){
        listenerMarketList.add(listener);
    }

    public void setListenerMarketList(String stock){
        for (ListenerMarket listenerMarket: listenerMarketList){
            listenerMarket.update(stock);
        }
    }
}
