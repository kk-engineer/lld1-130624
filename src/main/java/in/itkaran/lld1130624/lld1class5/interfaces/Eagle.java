package in.itkaran.lld1130624.lld1class5.interfaces;

public class Eagle implements Bird {

    public void move() {
        System.out.println("Moving Eagle");
    }

    public void eat() {
        System.out.println("Eating Eagle");
    }

    public void fly() {
        System.out.println("Flying Eagle");
    }

    public boolean canFly() {
        return true;
    }
}
