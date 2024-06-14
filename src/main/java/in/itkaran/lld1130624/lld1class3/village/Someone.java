package in.itkaran.lld1130624.lld1class3.village;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
        showRelativeAccess();
    }

    public static void demoAccess() {
       JointFamily jointFamily = new JointFamily();
       jointFamily.showPropertyDetails();
       jointFamily.showPrivatePropertyDetails();

       System.out.println(jointFamily.defaultProperty);
       System.out.println(jointFamily.protectedProperty);
       System.out.println(jointFamily.publicProperty);
    }

    public static void showRelativeAccess() {
        System.out.println("Show Paternal Relative Access");
        PaternalRelative paternalRelative = new PaternalRelative();
        System.out.println(paternalRelative.protectedProperty);
        System.out.println(paternalRelative.publicProperty);
        paternalRelative.showAccess();
    }
}
