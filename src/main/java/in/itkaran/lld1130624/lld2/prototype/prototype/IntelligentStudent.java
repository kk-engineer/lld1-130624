package in.itkaran.lld1130624.lld2.prototype.prototype;

import lombok.Setter;

@Setter
public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(String name, int marks, int gradYear, String univName, String branch, String department, int iq) {
        super(name, marks, gradYear, univName, branch, department);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public String toString() {
        return super.toString() + " [Intelligent Student iq " + iq + "]";
    }
}
