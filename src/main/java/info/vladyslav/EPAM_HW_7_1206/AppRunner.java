package info.vladyslav.EPAM_HW_7_1206;

import info.vladyslav.EPAM_HW_7_1206.view.DeveloperView;

import java.io.IOException;

/**
 * Console CRUD application that has next entities:
 * Developer, Skill, Account.
 * <p>
 * All starts from Developer view
 */

public class AppRunner {
    public static void main(String[] args) throws IOException {
        DeveloperView developerView = new DeveloperView();
        developerView.viewDeveloperMenu();
    }
}
