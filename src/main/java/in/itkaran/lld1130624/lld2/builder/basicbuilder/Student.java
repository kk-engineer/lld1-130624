package in.itkaran.lld1130624.lld2.builder.basicbuilder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private String email;
    private String phoneNo;
    private String univName;
    private int gradYear;

    public Student(Builder builder) {
        // Validations
        if (builder.getGradYear() < 2022) {
            throw new RuntimeException("Grad year must be 2022 or greater");
        }

        if (builder.getPsp() < 70) {
            throw new RuntimeException("PSP must be greater than 70");

        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.email = builder.getEmail();
        this.phoneNo = builder.getPhoneNo();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
    }
}
