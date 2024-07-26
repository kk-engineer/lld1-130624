package in.itkaran.lld1130624.lld2.prototype.clone;

public class Client {
    public static void main(String[] args) {
        try {
            demoClone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Clone not supported" + e.getMessage());
        }

    }

    public static void demoClone() throws CloneNotSupportedException {
        Student st1 = new Student("KK", 40);
        Student st2 = (Student)st1.clone();
        System.out.println("Debug");
    }
}
