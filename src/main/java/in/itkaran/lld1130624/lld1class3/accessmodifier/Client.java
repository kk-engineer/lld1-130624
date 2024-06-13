package in.itkaran.lld1130624.lld1class3.accessmodifier;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.driveVehicle();
        System.out.println(vehicle.protectedPrice);
        System.out.println(vehicle.publicColor);
        System.out.println(vehicle.defaultModel);
        // Private not accessible
    }
}
