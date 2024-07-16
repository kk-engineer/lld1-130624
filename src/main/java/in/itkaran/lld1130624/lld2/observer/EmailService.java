package in.itkaran.lld1130624.lld2.observer;

import java.util.Observer;

public class EmailService implements Subscriber {
    @Override
    public void notifyMe() {
        System.out.println("Sending email");
    }
}
