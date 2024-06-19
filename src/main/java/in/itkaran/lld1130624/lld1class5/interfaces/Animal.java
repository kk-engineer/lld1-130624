package in.itkaran.lld1130624.lld1class5.interfaces;

public interface Animal {

    void move();
    void eat();
    default public boolean canFly() {
        return false;
    }
    default void fly() {
        System.out.println("Oops can't fly");
    }
}
