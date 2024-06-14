package in.itkaran.lld1130624.lld1class3.village;

public class Someone {
    public static void main(String[] args) {
        demoAccess();
    }

    public static void demoAccess() {
       JointFamily jointFamily = new JointFamily();
       jointFamily.setPropertyNames();
       System.out.println(jointFamily.defaultProperty);
       System.out.println(jointFamily.protectedProperty);
       System.out.println(jointFamily.publicProperty);
    }
}
