package in.itkaran.lld1130624.lld2.observer;

import java.util.Observer;

public class LogisticService implements Subscriber {
    @Override
    public void notifyMe() {
        System.out.println("Updating parcel details");
    }
}
