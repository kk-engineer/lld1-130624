package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

public class Client {
    public static void main(String[] args) {

        demoCopyConstructor();
    }

    public static void demoCopyConstructor() {
        Student st1 = new Student("KK", 40);
        Student st2 = new Student(st1);
        System.out.println("Debug");
    }
}
