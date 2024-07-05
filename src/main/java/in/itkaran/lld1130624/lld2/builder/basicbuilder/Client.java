package in.itkaran.lld1130624.lld2.builder.basicbuilder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Karan");
        builder.setAge(40);
        builder.setPsp(70);
        builder.setGradYear(2023);
        builder.setBatch("Oct 22");

        Student st = new Student(builder);
        System.out.println("Debug");
    }
}
