package in.itkaran.lld1130624.lld2.prototype.copyconstructor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoCopyConstructor();
    }

    public static void demoCopyConstructor() {
        List<Student> students = new ArrayList<>();
        List<Student> studentsCopy = new ArrayList<>();
        Student st1 = new Student("KK", 40);
        Student is = new IntelligentStudent("KK", 140, 160);
        Student cs = new CreativeStudent("AK", 28, 200);

        students.add(st1);
        students.add(is);
        students.add(cs);
        // Check instanceOf
        for (Student student : students) {
            Student stCopy = null;
            if (student instanceof IntelligentStudent) {
                IntelligentStudent isCopy = (IntelligentStudent) student;
                stCopy = new IntelligentStudent(isCopy);
            }
            else if (student instanceof CreativeStudent) {
                CreativeStudent csCopy = (CreativeStudent) student;
                stCopy = new CreativeStudent(csCopy);
            }
            else {
                stCopy = new Student(student);
            }
            studentsCopy.add(stCopy);
        }


//        Student st2 = st1.copy();
//        Student isCopy = is.copy();
//        Student csCopy = cs.copy();
        System.out.println("Debug");
    }
}
