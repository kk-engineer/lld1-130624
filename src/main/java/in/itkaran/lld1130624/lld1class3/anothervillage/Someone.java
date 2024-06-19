package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.Family;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
    }

    private static void demoAccess() {
        Family family = new Family();
        family.showPropertyDetails();
        System.out.println(family.publicProperty);

        MaternalRelative maternalRelative = new MaternalRelative();
        System.out.println(maternalRelative.publicProperty);
        maternalRelative.showPropertyDetails();
        maternalRelative.showAccess();
    }
}
