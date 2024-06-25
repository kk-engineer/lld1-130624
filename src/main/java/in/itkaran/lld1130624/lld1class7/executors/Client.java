package in.itkaran.lld1130624.lld1class7.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        System.out.println("Main thread "+Thread.currentThread().getName());
        for (int i = 1; i <= 100; i++) {
            if (i == 5 || i==11 || i == 20) {
                System.out.println("Debug");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
        executor.shutdown();
    }
}
