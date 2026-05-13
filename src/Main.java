import main.java.com.ashi.model.HostingOrder;
import main.java.com.ashi.observer.*;
import main.java.com.ashi.subject.HostingProvisioningService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HostingProvisioningService provisioningService =
                new HostingProvisioningService();

        provisioningService.subscribe(new DNSService());
        provisioningService.subscribe(new EmailService());
        // provisioningService.subscribe(new SSLService());
        provisioningService.subscribe(new BillingService());
        provisioningService.subscribe(new MonitoringService());

        HostingOrder order = new HostingOrder(
                "example.com",
                "customer@gmail.com"
        );

        provisioningService.provisionHosting(order);
    }
}