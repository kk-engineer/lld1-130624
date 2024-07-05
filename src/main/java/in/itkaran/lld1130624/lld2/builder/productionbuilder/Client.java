package in.itkaran.lld1130624.lld2.builder.productionbuilder;

public class Client {
    public static void main(String[] args) {
//        Student.Builder builder = Student.getBuilder();
//        builder.setName("Karan");
//        builder.setAge(40);
//        builder.setPsp(70);
//        builder.setGradYear(2023);
//        builder.setBatch("Oct 22");
//
//        Student st = builder.build();

        Student st2 = Student.getBuilder()
                        .setName("Karan")
                                .setAge(40)
                                        .setGradYear(2023)
                                                .setPsp(70)
                                                        .build();
        System.out.println("Debug");
    }
}
