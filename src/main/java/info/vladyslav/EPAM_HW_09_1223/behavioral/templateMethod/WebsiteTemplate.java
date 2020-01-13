package info.vladyslav.EPAM_HW_09_1223.behavioral.templateMethod;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
