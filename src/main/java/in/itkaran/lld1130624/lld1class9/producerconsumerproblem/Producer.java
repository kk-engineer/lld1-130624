package in.itkaran.lld1130624.lld1class9.producerconsumerproblem;

import java.util.Queue;

public class Producer implements Runnable {
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Producer(Queue<Object> queue, String name, int maxSize) {
        this.queue = queue;
        this.name = name;
        this.maxSize = maxSize;
    }

    public void run() {
        while (true) {
            if (this.queue.size() < this.maxSize) {
                System.out.println(this.name + " Adding an element , size : " + queue.size());
                queue.add(new Object());
                System.out.println(this.name + " After -> Adding an element , size : " + queue.size());
//                if (queue.size() > this.maxSize) {
//                    throw new QueueFullException("Queue is full");
//                }
            }

        }
    }
}
