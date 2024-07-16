package in.itkaran.lld1130624.lld2.observer;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyMe();
        }
    }
}
