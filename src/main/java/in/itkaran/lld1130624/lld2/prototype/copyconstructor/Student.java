package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

public class Student {
    private String name;
    private int age;
//    private double psp;
//    private int gradYear;
//    private String univName;
//    private String companyName;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student student) {
        System.out.println("Default constructor");
        this.name = student.name;
        this.age = student.age;
    }
}
