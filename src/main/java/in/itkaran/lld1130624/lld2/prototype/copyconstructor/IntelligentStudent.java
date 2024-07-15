package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        System.out.println("IntelligentStudent copy constructor");
        this.iq = student.iq;
    }
}
