package in.itkaran.lld1130624.lld1class4.polymorphism;

public class Client {
    public static void main(String[] args) {
        demoPolymorphism();
    }
    private static void demoPolymorphism() {
        User u1 = new Student();
        ((Student) u1).fee = 300000.00;
        System.out.println(((Student) u1).fee);
        User u2 = new Instructor();
        ((Student) u2).fee = 100000.00;
        System.out.println(((Student) u2).fee);

    }
}
