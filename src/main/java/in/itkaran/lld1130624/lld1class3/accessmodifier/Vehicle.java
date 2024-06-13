package in.itkaran.lld1130624.lld1class3.accessmodifier;

public class Vehicle {
    private int privatePower;
    String defaultModel;
    public String publicColor;
    protected double protectedPrice;

    public void driveVehicle() {
        privatePower = 1500;   // in CC
        defaultModel = "Ferrari";
        publicColor = "red";
        protectedPrice = 50000;  // in USD
    }

    // provide access of private attribute to child class
    protected int getPrivatePower() {
        return privatePower;
    }
}
