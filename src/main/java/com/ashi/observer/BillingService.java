package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public class BillingService implements Observer{
    @Override
    public void update(HostingEvent event) {
        System.out.println(
                "Billing Service: Creating invoice for: "
                        + event.getDomain()
        );
    }
}
