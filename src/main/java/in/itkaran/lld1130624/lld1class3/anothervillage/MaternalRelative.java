package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.Family;

public class MaternalRelative extends Family {

    public void showAccess() {
        System.out.println("Show Maternal Relative Access");
        System.out.println(publicProperty);
        System.out.println(protectedProperty);
        showPrivatePropertyDetails();
    }
}
