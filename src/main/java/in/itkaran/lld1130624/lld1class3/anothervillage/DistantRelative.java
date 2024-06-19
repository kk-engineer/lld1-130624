package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.Family;

public class DistantRelative extends Family {

    public void showAccess() {
        System.out.println(publicProperty);
        System.out.println(protectedProperty);
        showPrivatePropertyDetails();
    }
}
