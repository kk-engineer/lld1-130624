package in.itkaran.lld1130624.lld1class13.finalize;

public class Student {
    public void finalize() throws Throwable {
        System.out.println("finalize");
    }

    public static void main(String[] args) throws Throwable {
        Student s = new Student();
        s.finalize();
        // set the object to null and call GC
        s = null;
        System.gc();
    }
}
