package in.itkaran.lld1130624.lld1class3.village;

public class Family {
    private String privateProperty;
    Integer defaultProperty;
    protected Boolean protectedProperty;
    public String publicProperty;

    public void showPropertyDetails() {
        System.out.println(privateProperty);
        System.out.println(defaultProperty);
        System.out.println(protectedProperty);
        System.out.println(publicProperty);
        //showPrivatePropertyDetails();
    }

    protected void showPrivatePropertyDetails() {
        System.out.println(privateProperty);
    }

    class SubFamily {

        public void showAccess() {
            System.out.println(privateProperty);
        }
    }
}
