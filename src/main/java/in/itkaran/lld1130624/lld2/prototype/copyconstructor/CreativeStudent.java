package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

public class CreativeStudent extends Student {
    private int eq;
    public CreativeStudent(String name, int age, int eq) {
        super(name, age);
        this.eq = eq;
    }

    public CreativeStudent(CreativeStudent student) {
        super(student);
        System.out.println("CreativeStudent copy constructor");
        this.eq = student.eq;
    }
}
