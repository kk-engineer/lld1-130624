package in.itkaran.lld1130624.lld1class3.accessmodifier;

public class Student {
    String name;
    int age;
    double psp;
    String batch;
    Address address;

    Student(String name, int age, double psp, String batch, Address address) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
        this.address = address;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.batch = s.batch;
        this.address = s.address;
    }
}
