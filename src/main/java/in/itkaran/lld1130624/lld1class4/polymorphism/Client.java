package in.itkaran.lld1130624.lld1class4.polymorphism;

public class Client {
    public static void main(String[] args) {
        demoPolymorphism();
        //demoMethodOverloading();
        //demoMethodOverRiding();
    }

    private static void demoMethodOverRiding() {
        User user = new User();
        user.whoAmI();
        user = new Student();
        user.whoAmI();
        user = new Instructor();
        user.whoAmI();
    }

    private static void demoMethodOverloading() {
        User user = new User();
        user.sayHello();
        user.sayHello("Karan");
        user.sayHello("Karan", 40);
        user.sayHello(40, "Karan");
    }

    private static void demoPolymorphism() {
        User u1 = new Student();
        ((Student) u1).fee = 300000.00;
        System.out.println(((Student) u1).fee);
        User u2 = new Instructor();
        ((Instructor) u2).salary = 100000.00;
        System.out.println(((Student) u2).fee);
    }
}
