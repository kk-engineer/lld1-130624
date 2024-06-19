package in.itkaran.lld1130624.lld1class3.village;

public class Relative extends Family {

    private Integer privateMember;

    class ABC {
        void showAccess() {
            System.out.println("Private member: " + privateMember);
        }
    }

    public void showAccess() {
        System.out.println(protectedProperty);
        System.out.println(defaultProperty);
        System.out.println(publicProperty);
        showPrivatePropertyDetails();
    }
}
