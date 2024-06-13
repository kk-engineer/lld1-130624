package in.itkaran.lld1130624.lld1class3.accessmodifier;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.driveVehicle();
//        System.out.println(vehicle.protectedPrice);
//        System.out.println(vehicle.publicColor);
//        System.out.println(vehicle.defaultModel);

        Address a1 = new Address();
        a1.city = "Pune";
        a1.state = "Maharashtra";
        a1.country = "India";
        Student s1 = new Student("Karan", 40, 79.6, "Oct 21", a1);
        Student s2 = new Student(s1);
        s1.address.city = "Mumbai";
        System.out.println(s1.address.city + " " + s2.address.city);
    }
}
