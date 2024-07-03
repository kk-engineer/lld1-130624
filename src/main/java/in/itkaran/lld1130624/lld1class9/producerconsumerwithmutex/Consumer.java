package in.itkaran.lld1130624.lld1class9.producerconsumerwithmutex;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Consumer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            synchronized (queue) {
                if (this.queue.size() > 0) {
                    System.out.println(this.name + " Removing an element , size : " + queue.size());
                    queue.remove();
                    System.out.println(this.name + " After -> Removing an element , size : " + queue.size());
                }
            }

        }
    }
}
