package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public class SSLService implements Observer{
    @Override
    public void update(HostingEvent event) {
        System.out.println(
                "SSL Service: Generating SSL certificate for: "
                        + event.getDomain()
        );
    }
}
