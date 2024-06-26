package in.itkaran.lld1130624.lld1class8.synchronizedmethod;

public class Adder implements  Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }
    public void run() {
        System.out.println("Adder thread " + Thread.currentThread().getName());
        for (int i = 1; i <= 10000; i++) {
            //System.out.println("Adder thread " + Thread.currentThread().getName() + " Count = " + count.value);
            count.incrementValue(i);
        }
    }
}
