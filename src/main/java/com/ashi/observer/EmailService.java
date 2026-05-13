package main.java.com.ashi.observer;

import main.java.com.ashi.event.HostingEvent;

public class EmailService implements Observer {
    @Override
    public void update(HostingEvent event) {
        System.out.println(
                "Email Service: Sending welcome email to: "
                        + event.getCustomerEmail()
        );
    }
}
