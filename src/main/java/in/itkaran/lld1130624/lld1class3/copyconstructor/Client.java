package in.itkaran.lld1130624.lld1class3.copyconstructor;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        //demoCopyConstructor();
        demoChildAttributes();
    }

    private static void demoChildAttributes() {
        Mentor mentor = new Mentor("KK", 40);
        System.out.println("Debug");
    }

    private static void demoCopyConstructor() {
        User u1 = new User("Karan", 40);
        u1.setNumList(new ArrayList<Integer>());
        User u2 = new User(u1);
        u1.setName("KK");
        u2.setAge(25);
        u1.getNumList().add(25);
        u2.getNumList().add(45);
        System.out.println("Hi");
    }


}
