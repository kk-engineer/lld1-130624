package in.itkaran.lld1130624.lld1class6.introtothreads;

public class NumberPrinter implements Runnable {
    private int number;
    public NumberPrinter(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Printing " + this.number + " " + Thread.currentThread().getName());
//          for (;;) {
//              // do nothing
//          }
    }

}
