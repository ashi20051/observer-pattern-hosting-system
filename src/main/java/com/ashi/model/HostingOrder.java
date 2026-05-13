package main.java.com.ashi.model;

public class HostingOrder {

    private String domain;  // stores example.com

    private String customerEmail;   // stores customer@gmail.com

    // constructor used to create object like - new HostingOrder("example.com", "customer@gmail.com");
    public HostingOrder(String domain, String customerEmail) {
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