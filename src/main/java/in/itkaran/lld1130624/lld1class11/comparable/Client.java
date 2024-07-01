package in.itkaran.lld1130624.lld1class11.comparable;

import com.sun.source.tree.Tree;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        demoComparable();
    }

    private static void demoComparable() {
        Car car1 = new Car("A", 50, 200);
        Car car2 = new Car("B", 10, 180);
        Car car3 = new Car("C", 20, 250);
        Car car4 = new Car("D", 30, 400);
        Car car5 = new Car("E", 40, 300);

        Queue<Car> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(car1);
        priorityQueue.add(car2);
        priorityQueue.add(car3);
        priorityQueue.add(car4);
        priorityQueue.add(car5);
        while (!priorityQueue.isEmpty()) {
            Car car = priorityQueue.poll();
            System.out.println(car);
        }
    }
}
