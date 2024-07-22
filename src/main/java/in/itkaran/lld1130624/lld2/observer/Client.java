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

        // subscribe for notifications
        amazon.subscribe(subscriber1);
        amazon.subscribe(subscriber2);
        amazon.subscribe(subscriber3);

        // notify all subscribers
        amazon.notifySubscribers();

        // unsubscribe
        System.out.println("Unsubscribe Logistic Service");
        amazon.unsubscribe(subscriber3);

        // notify all subscribers
        amazon.notifySubscribers();
    }
}
