package in.itkaran.lld1130624.lld1class7.addersubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            count.value -= i;
        }
    }
}
