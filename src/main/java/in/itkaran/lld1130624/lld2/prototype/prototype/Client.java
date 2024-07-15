package in.itkaran.lld1130624.lld2.prototype.prototype;

public class Client {
    public static void main(String[] args) {

        //demoPrototype();
        demoRegistry();
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student st1 = new Student("KK", 79, 2007, "Sastra",
                "EEE", "SOEE");
        studentRegistry.register(StudentType.STUDENT_EEE, st1);
        IntelligentStudent st2 = new IntelligentStudent("KK", 79, 2007, "Sastra",
                "EEE", "SOEE", 160);
        studentRegistry.register(StudentType.INTELLIGENT_STUDENT_EEE, st2);
    }
    private static void demoRegistry() {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student stPrototype = studentRegistry.get(StudentType.STUDENT_EEE);
        Student stCopy = stPrototype.copy();
        stCopy.setName("AK");
        stCopy.setMarks(90);
        stCopy.setGradYear(2019);

        System.out.println(stPrototype);
        System.out.println(stCopy);

        IntelligentStudent isPrototype = (IntelligentStudent) studentRegistry.get(StudentType.INTELLIGENT_STUDENT_EEE);
        IntelligentStudent isCopy = isPrototype.copy();
        isCopy.setName("AK");
        isCopy.setIq(170);
        isCopy.setGradYear(2019);

        System.out.println(isPrototype);
        System.out.println(isCopy);
    }

    public static void demoPrototype() {
        Student st1 = new Student("KK", 79, 2007, "Sastra",
                "EEE", "SOEE");
        Student st2 = new Student(st1);
        IntelligentStudent st3 = new IntelligentStudent("KK", 79, 2007, "Sastra",
                "EEE", "SOEE", 120);
        Student st4 = new IntelligentStudent(st3);
        // What if we do not know the type of st3 ?
        // can we use copy constructor - No
        Student st5 = st3.copy();
        Student st6 = st1.copy();
        System.out.println("Debug");
    }
}
