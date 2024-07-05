package in.itkaran.lld1130624.lld1class10.bounds;

import java.util.List;

public class BoundDemo {
    public void fun(List<Animal> animals) {
        System.out.println("fun");
    }

    public <T> void fun2(List<? extends T> animals) {
        System.out.println("fun2");
    }

    public void fun3(List<? extends Animal> animals) {
        System.out.println("fun3");
    }

    public void fun4(List<? super Cat> cats) {
        System.out.println("fun4");
    }

    public <T> void fun5(List<? super T> entities) {
        System.out.println("fun5");
    }
}
