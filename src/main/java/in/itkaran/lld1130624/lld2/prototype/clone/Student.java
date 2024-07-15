package in.itkaran.lld1130624.lld2.prototype.clone;

public class Student implements Cloneable{
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

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
