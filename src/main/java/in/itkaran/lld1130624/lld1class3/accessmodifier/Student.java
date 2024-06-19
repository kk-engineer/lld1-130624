package in.itkaran.lld1130624.lld1class3.accessmodifier;

public class Student {
    char[] name;
    int age;
    double psp;
    //char [] batch;
    Address address;

    Student(char[] name, int age, double psp, Address address) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        //this.batch = batch;
        this.address = address;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        //this.batch = s.batch;
        this.address = s.address;
    }

    public Student(String karan, int i) {
    }
}
