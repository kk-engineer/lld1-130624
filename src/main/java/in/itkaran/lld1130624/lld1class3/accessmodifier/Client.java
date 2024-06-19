package in.itkaran.lld1130624.lld1class3.accessmodifier;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        //demoAccess();
        demoCopy();
        //demoArgPassing();
        //demoStrings();
    }

    public static void demoAccess() {
        Vehicle vehicle = new Vehicle();
        vehicle.driveVehicle();
        System.out.println(vehicle.protectedPrice);
        System.out.println(vehicle.publicColor);
        System.out.println(vehicle.defaultModel);
    }

    public static void demoCopy() {
        Address a1 = new Address();
        a1.city = "Pune";
        a1.state = "Maharashtra";
        a1.country = "India";
        char[] name = {'K', 'A', 'R', 'A', 'N'};
        Student s1 = new Student(name, 40, 79.6, a1);
        Student s2 = new Student(s1);
        s1.address.city = "Mumbai";
        s2.age = 25;
        s2.name[0] = 'S';
        System.out.println(s1.address.city + " " + s2.address.city);
    }

//    public static void demoArgPassing() {
//        Address a1 = new Address();
//        a1.city = "Pune";
//        a1.state = "Maharashtra";
//        a1.country = "India";
//        //Student s1 = new Student("Karan", 40, 79.6, "Oct 21", a1);
//
//        // pass by value
//        int x = 5;
//        System.out.println("Pass by value");
//        System.out.println("before fun " + x);
//        fun(x);
//        System.out.println("after fun " + x);
//
//        // pass by reference
//        System.out.println("Pass by reference");
//        System.out.println("before fun " + s1.name);
//        fun(s1);
//        System.out.println("after fun " + s1.name);
//    }

    public static void fun(int x) {
        System.out.println("Change value to 10");
        x = 10;
    }

    public static void fun(Student s) {
        System.out.println("Change name to Ayushi");
        //s.name = "Ayushi";
    }

    public static void demoStrings() {
        // Strings
        // Reference: https://www.freecodecamp.org/news/strings-in-java/
        // Creates a new string only when required
        // Maintains a string pool for frequent strings for performance
        // need not create the same string object again on heap and can be re-used
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        char c1[] = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(c1);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1==str4);
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str4));
    }

}
