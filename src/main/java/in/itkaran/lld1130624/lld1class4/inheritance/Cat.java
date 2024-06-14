package in.itkaran.lld1130624.lld1class4.inheritance;

public class Cat extends Mammal {
    Cat() {
        System.out.println("Cat with no args");
    }

    public void whoAmI() {
        System.out.println("I am a Cat!");
    }

    Cat(String name) {
        System.out.println("Cat name: " + name);
    }

    Cat(String name, String color) {
        System.out.println("Cat name: " + name + " color: " + color);
    }
}
