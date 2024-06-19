package in.itkaran.lld1130624.lld1class3.village;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
        showRelativeAccess();
    }

    public static void demoAccess() {
       Family family = new Family();
       family.showPropertyDetails();
       family.showPrivatePropertyDetails();

       System.out.println(family.defaultProperty);
       System.out.println(family.protectedProperty);
       System.out.println(family.publicProperty);
    }

    public static void showRelativeAccess() {
        System.out.println("Show Paternal Relative Access");
        PaternalRelative paternalRelative = new PaternalRelative();
        System.out.println(paternalRelative.protectedProperty);
        System.out.println(paternalRelative.publicProperty);
        paternalRelative.showAccess();
    }
}
