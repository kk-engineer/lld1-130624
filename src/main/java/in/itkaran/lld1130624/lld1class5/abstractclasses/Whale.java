package in.itkaran.lld1130624.lld1class5.abstractclasses;

// Make whale abstract so that its object cannot be created.
public abstract class Whale extends Mammal {

    void move() {
        System.out.println("Whale moves on 4 fins");
    }

    void breathe() {
        System.out.println("Whale breathes through blowhole on head");
    }
}
