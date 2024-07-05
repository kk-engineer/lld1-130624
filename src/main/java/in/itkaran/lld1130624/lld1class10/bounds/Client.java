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
        BoundDemo boundDemo = new BoundDemo();
        // Below statement will give compilation error
        //demo.fun(dogs);
        boundDemo.fun(animals);
    }

    private static void demoUpperBound() {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        BoundDemo boundDemo = new BoundDemo();
        boundDemo.fun2(animals);
        boundDemo.fun2(dogs);
        List<Plant> plants = new ArrayList<>();
        boundDemo.fun2(plants);
        boundDemo.fun2(new ArrayList<>());

        boundDemo.fun3(animals);
        boundDemo.fun3(dogs);
        // Below statement will give compilation error
        //demo.fun3(plants);
        boundDemo.fun3(new ArrayList<>());
    }

    private static void demoLowerBound() {
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        BoundDemo boundDemo = new BoundDemo();
        boundDemo.fun4(animals);
        boundDemo.fun4(mammals);
        boundDemo.fun4(cats);
        boundDemo.fun4(new ArrayList<>());
        // Below statement will give compilation error
        //demo.fun4(dogs);

        List<Plant> plants = new ArrayList<>();
        boundDemo.fun5(animals);
        boundDemo.fun5(mammals);
        boundDemo.fun5(cats);
        boundDemo.fun5(dogs);
        boundDemo.fun5(plants);
        boundDemo.fun5(new ArrayList<>());
    }

    private static void demoMultipleBounds() {
        MultipleBound<Bounded> multipleBound = new MultipleBound<>();
        multipleBound.fun();
        System.out.println("DEBUG");
    }
}
