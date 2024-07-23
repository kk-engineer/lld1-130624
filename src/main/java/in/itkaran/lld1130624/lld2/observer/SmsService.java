package in.itkaran.lld1130624.lld2.observer;

import java.util.Observer;

public class SmsService implements Subscriber {


    @Override
    public void update() {
        System.out.println("Sending SMS");
    }
}
