package in.itkaran.lld1130624.lld2.observer;

import java.util.Observable;
import java.util.Observer;

public class InvoiceService implements Subscriber {
    @Override
    public void update() {
        System.out.println("Print Invoice");
    }
}
