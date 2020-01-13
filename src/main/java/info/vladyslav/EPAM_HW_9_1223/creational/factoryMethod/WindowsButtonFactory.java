package info.vladyslav.EPAM_HW_9_1223.creational.factoryMethod;

public class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
