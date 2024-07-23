package in.itkaran.lld1130624.lld2.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void register(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void deregister(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void onOrderPlaced() {
        notifySubscribers();
    }
}
