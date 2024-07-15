package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

public class Client {
    public static void main(String[] args) {

        demoCopyConstructor();
    }

    public static void demoCopyConstructor() {
        Student st1 = new Student("KK", 40);
        Student st2 = st1.copy();

        Student is = new IntelligentStudent("KK", 140, 160);
        Student isCopy = is.copy();

        Student cs = new CreativeStudent("AK", 28, 200);
        Student csCopy = cs.copy();
        System.out.println("Debug");
    }
}
