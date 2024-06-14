package in.itkaran.lld1130624.lld1class4.inheritance;

public class Client {
    public static void main(String[] args) {
        //demoInheritance();
        demoRuntimePolymorphism();
    }

    private static void demoRuntimePolymorphism() {
        Animal animal = new Mammal();
        animal.whoAmI();

        Cat cat = new Lion();
        cat.whoAmI();

        Mammal mammal = new Cat();
        mammal.whoAmI();
    }

    public static void demoInheritance() {
        Lion lion = new Lion();
    }
}
