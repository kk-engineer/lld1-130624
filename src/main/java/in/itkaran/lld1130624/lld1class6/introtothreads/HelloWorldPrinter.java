package in.itkaran.lld1130624.lld1class6.introtothreads;

public class HelloWorldPrinter implements Runnable {
    public void run() {
        System.out.println("Hello World "  + Thread.currentThread().getName());
//          for (;;) {
//              // do nothing
//          }
    }

}
