package info.vladyslav.EPAM_HW_09_1223.creational.factoryMethod;


public class RunButton {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = createButtonByName("HTML"); // the new approach

        Button button = buttonFactory.createButton();
        button.wrightButtonName();
    }

    static ButtonFactory createButtonByName(String buttonName){
        if(buttonName.equalsIgnoreCase("Windows")){
            return new WindowsButtonFactory();
        } else if (buttonName.equalsIgnoreCase("HTML")){
            return new HTTPButtonFactory();
        }
        else {
            throw new RuntimeException(buttonName + " is unknown buttonName.");
        }
    }
}
