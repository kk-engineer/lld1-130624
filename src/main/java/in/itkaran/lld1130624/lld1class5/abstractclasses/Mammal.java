package in.itkaran.lld1130624.lld1class5.abstractclasses;

public abstract class Mammal {
    int limbs;
    String name;

    void eat() {
        // default definition
        System.out.println("Mammal eats");
    }
    abstract void move();
    abstract void breathe();
}
