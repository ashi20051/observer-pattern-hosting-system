package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public class DNSService implements Observer {

    @Override
    public void update(HostingEvent event) {
        System.out.println(
                "DNS Service: Configuring DNS for domain: "
                        + event.getDomain()
        );
    }
}