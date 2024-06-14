package in.itkaran.lld1130624.lld1class4.inheritance;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class Lion extends Cat {
    Lion() {
        // call to super must be first statement in constructor
        // System.out.println("Before super: Lion");
        super();
        //super("Leo");
        //super("Leo", "White");
        System.out.println("Lion");
    }
}
