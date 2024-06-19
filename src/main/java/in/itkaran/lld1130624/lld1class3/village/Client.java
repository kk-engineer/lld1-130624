package in.itkaran.lld1130624.lld1class3.village;

public class Client {
    public static void main(String[] args) {
        demoAccess();
        //showRelativeAccess();
    }

    public static void demoAccess() {
       Family family = new Family();
       System.out.println(family.defaultProperty);
       System.out.println(family.protectedProperty);
       System.out.println(family.publicProperty);
    }

    public static void showRelativeAccess() {
        System.out.println("Show Paternal Relative Access");
        Relative relative = new Relative();
        System.out.println(relative.protectedProperty);
        System.out.println(relative.publicProperty);
        relative.showAccess();
    }
}
