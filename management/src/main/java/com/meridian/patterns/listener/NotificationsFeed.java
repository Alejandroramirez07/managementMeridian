package com.meridian.patterns.listener;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFeed {
    private List<Listener> listeners = new ArrayList<>();

    public void addListeners(Listener listener) {
        listeners.add(listener);

    }

    public void setNotifications(String notifications){
        for (Listener listener: listeners ){
            listener.inform(notifications);
        }
    }
}
