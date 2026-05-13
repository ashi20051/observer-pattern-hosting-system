package main.java.com.ashi.subject;

import main.java.com.ashi.event.HostingEvent;
import main.java.com.ashi.model.HostingOrder;
import main.java.com.ashi.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class HostingProvisioningService implements Subject{

    private final List<Observer> observers = new ArrayList<>();  // Stores all subscribers.

    @Override
    // Adds observers dynamically.
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    // Core of Observer Pattern. - Every subscriber reacts.
    public void notifyObservers(HostingEvent event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void provisionHosting(HostingOrder order) {

        System.out.println(
                "Provisioning hosting for domain: "
                        + order.getDomain()
        );

        HostingEvent event = new HostingEvent(
                order.getDomain(),
                order.getCustomerEmail()
        );

        notifyObservers(event);
    }
}
