package in.itkaran.lld1130624.lld2.observer;

import java.util.Observer;

public class LogisticService implements Subscriber {
    @Override
    public void update() {
        System.out.println("Updating package courier details");
    }
}
