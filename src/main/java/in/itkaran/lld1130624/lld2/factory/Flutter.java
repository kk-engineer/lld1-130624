package in.itkaran.lld1130624.lld2.factory;

public class Flutter {
    private String platform;

    // Non-Factory methods
    void refreshUI() {
        System.out.println("Refresh UI");
    }

    void setTheme() {
        System.out.println("Setting theme");
    }

    // Factory method
    UIFactory getUIFactory(String platform) {
        if (platform.equals("Windows")) {
            return new WindowsUIFactory();
        }
        else if (platform.equals("Android")) {
            return new AndroidUIFactory();
        }
        else if (platform.equals("IOS")) {
            return new IosUIFactory();
        }

        return null;
    }

    // Better way
    UIFactory getUIFactory(SupportedPlatform platform) {
//        if (platform.equals(SupportedPlatform.WINDOWS)) {
//            return new WindowsUIFactory();
//        }
//        else if (platform.equals(SupportedPlatform.ANDROID)) {
//            return new AndroidUIFactory();
//        }
//        else if (platform.equals(SupportedPlatform.IOS)) {
//            return new IosUIFactory();
//        }
//
//        return null;
        return UIFactoryFactory.getUIFactory(platform);
    }

    // Ques: Flutter is our main class and
    // a lot of if-else condition does not look good here, then
    // lets move it to another class - somewhat better
    // lets localise the change
    // so that the core Flutter class does not violate OCP.
    // Ques: Can we avoid conditional statements 100% from your code
}
