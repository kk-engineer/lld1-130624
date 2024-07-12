package in.itkaran.lld1130624.lld2.factory;

import in.itkaran.lld1130624.lld2.factory.components.button.Button;
import in.itkaran.lld1130624.lld2.factory.components.dropdown.DropDown;

public class Client {
    public static void main(String[] args) {
        demoFactory();
    }

    private static void demoFactory() {
        Flutter flutter = new Flutter();
        // UIFactory uiFactory = flutter.getUIFactory("Android");
        // Ques: Do you see any issue with passing String above ?
        // Yes - there can be typo error
        // Let's make this as compile time check using Enum

        // Use SupportedPlatform Enum
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();
    }
}
