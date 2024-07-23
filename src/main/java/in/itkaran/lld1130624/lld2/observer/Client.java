package in.itkaran.lld1130624.lld2.observer;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        demoObserver();
    }

    private static void demoObserver() {
        Amazon amazon = new Amazon();
        Subscriber subscriber1 = new EmailService();
        Subscriber subscriber2 = new InventoryService();
        Subscriber subscriber3 = new LogisticService();
        Subscriber subscriber4 = new SmsService();
        Subscriber subscriber5 = new InvoiceService();

        // subscribe for notifications
        amazon.register(subscriber1);
        amazon.register(subscriber2);
        amazon.register(subscriber3);
        amazon.register(subscriber4);
        amazon.register(subscriber5);

        // notify all subscribers
        amazon.notifySubscribers();

        // unsubscribe
        System.out.println("Unsubscribe Logistic Service");
        amazon.deregister(subscriber3);

        // notify all subscribers
        amazon.notifySubscribers();
    }
}
