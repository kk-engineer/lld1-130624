package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.JointFamily;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
    }

    private static void demoAccess() {
        JointFamily jointFamily = new JointFamily();
        jointFamily.setPropertyNames();
        System.out.println(jointFamily.publicProperty);

        Relative relative = new Relative();
        relative.setPropertyNames();
        relative.relativeAccess();
    }
}
