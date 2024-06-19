package in.itkaran.lld1130624.lld1class5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoInterface();
    }

    private static void demoInterface() {
        Lion lion = new Lion();
        lion.move();
        lion.eat();
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        Animal eagle = new Eagle();
        animals.add(eagle);

        for (Animal animal : animals) {
            if (animal.canFly()) {
                animal.fly();
            }
            else {
                System.out.println("Can't fly");
            }
        }

    }
}
