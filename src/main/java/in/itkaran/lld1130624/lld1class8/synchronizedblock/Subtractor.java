package in.itkaran.lld1130624.lld1class8.synchronizedblock;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }
    public void run() {
        System.out.println("Subtractor thread " + Thread.currentThread().getName());
        for (int i = 1; i <= 10000; i++) {
            synchronized (count) {
                //System.out.println("Subtractor thread " + Thread.currentThread().getName() + " Count = " + count.value);
                count.value -= i;
            }
        }
    }
}
