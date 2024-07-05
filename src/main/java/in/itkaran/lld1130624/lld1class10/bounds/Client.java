package in.itkaran.lld1130624.lld1class10.bounds;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //demoBound();
        //demoUpperBound();
        demoLowerBound();
        //demoMultipleBounds();
    }

    private static void demoBound() {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Demo demo = new Demo();
        // Below statement will give compilation error
        //demo.fun(dogs);
        demo.fun(animals);
    }

    private static void demoUpperBound() {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Demo demo = new Demo();
        demo.fun2(animals);
        demo.fun2(dogs);
        List<Plant> plants = new ArrayList<>();
        demo.fun2(plants);
        demo.fun2(new ArrayList<>());

        demo.fun3(animals);
        demo.fun3(dogs);
        // Below statement will give compilation error
        //demo.fun3(plants);
        demo.fun3(new ArrayList<>());
    }

    private static void demoLowerBound() {
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        Demo demo = new Demo();
        demo.fun4(animals);
        demo.fun4(mammals);
        demo.fun4(cats);
        demo.fun4(new ArrayList<>());
        // Below statement will give compilation error
        //demo.fun4(dogs);

        List<Plant> plants = new ArrayList<>();
        demo.fun5(animals);
        demo.fun5(mammals);
        demo.fun5(cats);
        demo.fun5(dogs);
        demo.fun5(plants);
        demo.fun5(new ArrayList<>());
    }

    private static void demoMultipleBounds() {
        MultipleBound<Bounded> multipleBound = new MultipleBound<>();
        multipleBound.fun();
        System.out.println("DEBUG");
    }
}
