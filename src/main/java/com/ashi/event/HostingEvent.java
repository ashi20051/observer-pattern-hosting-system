package main.java.com.ashi.event;

/*
    🧠 Why separate Event class?  VERY IMPORTANT.
    We do NOT pass entire order object everywhere.

    Instead we publish: only relevant event data
    This is how real systems work.

    Example:
      Kafka event
      RabbitMQ message
      Domain event
 */

public class HostingEvent {

    private String domain;

    private String customerEmail;

    public HostingEvent(String domain, String customerEmail) {
        this.domain = domain;
        this.customerEmail = customerEmail;
    }

    public String getDomain() {
        return domain;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
