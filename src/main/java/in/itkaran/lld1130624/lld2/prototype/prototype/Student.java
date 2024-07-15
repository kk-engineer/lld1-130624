package in.itkaran.lld1130624.lld2.prototype.prototype;

import lombok.Setter;

@Setter
public class Student implements Prototype<Student> {
    private String name;
    private int marks;
    private int gradYear;
    private String univName;
    private String branch;
    private String department;

    public Student(String name, int marks, int gradYear, String univName, String branch, String department) {
        this.name = name;
        this.marks = marks;
        this.gradYear = gradYear;
        this.univName = univName;
        this.branch = branch;
        this.department = department;
    }

    public Student(Student student) {
        this.name = student.name;
        this.marks = student.marks;
        this.gradYear = student.gradYear;
        this.univName = student.univName;
        this.branch = student.branch;
        this.department = student.department;
    }

    public Student copy() {
        return new Student(this);
    }

    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + ", " +
                "gradYear=" + gradYear + ", univName=" + univName +
                ", branch=" + branch + ", department=" + department + "]";
    }
}
