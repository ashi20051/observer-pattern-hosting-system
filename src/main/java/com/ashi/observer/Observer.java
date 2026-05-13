package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public interface Observer {

    void update(HostingEvent event);  // Every observer MUST implement update()
                                      // Whenever event occurs - notifyObservers(event) - calls - observer.update(event)
}