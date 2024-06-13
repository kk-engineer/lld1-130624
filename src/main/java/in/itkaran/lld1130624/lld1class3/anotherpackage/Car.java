package in.itkaran.lld1130624.lld1class3.anotherpackage;

import in.itkaran.lld1130624.lld1class3.accessmodifier.Vehicle;

import java.sql.SQLOutput;

public class Car extends Vehicle {

    public Car() {
        System.out.println("Car Constructor\n");
    }
    public void showCar() {
        // public
        System.out.println(publicColor);
        // protected
        System.out.println(protectedPrice);
        // Use protected method in base to access private attributes
        // from child class
        System.out.println(getPrivatePower());
    }
}
