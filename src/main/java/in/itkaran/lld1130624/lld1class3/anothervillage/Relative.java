package in.itkaran.lld1130624.lld1class3.anothervillage;

import in.itkaran.lld1130624.lld1class3.village.JointFamily;

public class Relative extends JointFamily {

    public void relativeAccess() {
        System.out.println(publicProperty);
        System.out.println(protectedProperty);
        showPrivatePropertyDetails();
    }
}
