package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.JointFamily;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
    }

    private static void demoAccess() {
        JointFamily jointFamily = new JointFamily();
        jointFamily.showPropertyDetails();
        System.out.println(jointFamily.publicProperty);

        MaternalRelative maternalRelative = new MaternalRelative();
        System.out.println(maternalRelative.publicProperty);
        maternalRelative.showPropertyDetails();
        maternalRelative.showAccess();
    }
}
