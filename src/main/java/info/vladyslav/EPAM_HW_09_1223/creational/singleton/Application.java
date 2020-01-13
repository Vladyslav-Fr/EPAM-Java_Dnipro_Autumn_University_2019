package info.vladyslav.EPAM_HW_09_1223.creational.singleton;

class Application {
    public static void main(String[] args) {
        Singleton.getInstance().addLogInfo("I make singleton");
        Singleton.getInstance().addLogInfo("Hurrah!!!");
        Singleton.getInstance().showLogInfo();
    }
}
