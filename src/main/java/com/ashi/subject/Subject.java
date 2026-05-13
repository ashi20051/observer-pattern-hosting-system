package main.java.com.ashi.subject;

import main.java.com.ashi.event.HostingEvent;
import main.java.com.ashi.observer.Observer;

/*
 🧠 Why?

This defines contract for:

adding observers
removing observers
notifying observers
 */

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(HostingEvent event);
}
