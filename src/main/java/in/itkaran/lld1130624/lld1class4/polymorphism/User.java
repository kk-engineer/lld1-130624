package in.itkaran.lld1130624.lld1class4.polymorphism;

public class User {
    String name;

    // method overloading
    public void sayHello() {
        System.out.println("Hello World!");
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public void sayHello(String name, int age) {
        System.out.println("Hello " + name + " " + age);
    }

    public void sayHello(int age, String name) {
        System.out.println("Hello " + age + " " + name);
    }

    // method overriding
    public void whoAmI() {
        System.out.println("I'm a User");
    }
}
