package in.itkaran.lld1130624.lld1class3.village;

public class Family {
    private String privateProperty = "Money";
    String defaultProperty = "Fruits in garden";
    protected String protectedProperty = "Rooms in house";
    public String publicProperty = "Pond outside house";

    public void showPropertyDetails() {
        //System.out.println(privateProperty);
        System.out.println(defaultProperty);
        System.out.println(protectedProperty);
        System.out.println(publicProperty);
        showPrivatePropertyDetails();
    }

    protected void showPrivatePropertyDetails() {
        System.out.println(privateProperty);
    }
}
