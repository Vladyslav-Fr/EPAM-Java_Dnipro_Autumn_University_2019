package info.vladyslav.EPAM_HW_9_1223.behavioral.templateMethod;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welComePage = new WelComePage();
        WebsiteTemplate newsPage = new NewsPage();


        welComePage.showPage();

        System.out.println("\n===================================\n");

        newsPage.showPage();
    }
}
