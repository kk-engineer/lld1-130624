package in.itkaran.lld1130624.lld1class6.introtothreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main thread "+Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();
        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }

    }
}
