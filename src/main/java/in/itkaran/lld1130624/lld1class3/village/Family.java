package in.itkaran.lld1130624.lld1class3.village;

public class Family {
    private String privateProperty;
    Integer defaultProperty;
    protected Boolean protectedProperty;
    public String publicProperty;
    public static String publicStaticProperty;
    private static String privateStaticProperty;
    protected static String protectedStaticProperty;
    static String defaultStaticProperty;

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
