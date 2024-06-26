package in.itkaran.lld1130624.lld1class8.addersubtractorwithlock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    public void run() {
        System.out.println("Subtractor thread " + Thread.currentThread().getName());
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            //System.out.println("Subtractor thread " + Thread.currentThread().getName() + " Count = " + count.value);
            count.value -= i;
            lock.unlock();
        }
    }
}
