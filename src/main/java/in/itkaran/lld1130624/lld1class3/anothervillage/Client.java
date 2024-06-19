package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.Family;

public class Client {
    public static void main(String[] args) {
        demoAccess();
    }

    private static void demoAccess() {
        Family family = new Family();
        System.out.println(family.publicProperty);
    }
}
