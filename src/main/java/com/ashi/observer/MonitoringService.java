package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public class MonitoringService implements Observer{
    @Override
    public void update(HostingEvent event) {
        System.out.println(
                "Monitoring Service: Starting uptime monitoring for: "
                        + event.getDomain()
        );
    }
}
