package info.vladyslav.EPAM_HW_09_1223.creational.factoryMethod;

public class HTTPButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
