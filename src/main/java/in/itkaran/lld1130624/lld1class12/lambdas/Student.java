package in.itkaran.lld1130624.lld1class12.lambdas;

public class Student {
    public String name;
    public int rollNumber;
    public int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String toString() {
        return "[name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + "]" + "\n";
    }
}
