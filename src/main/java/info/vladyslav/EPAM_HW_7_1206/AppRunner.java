package info.vladyslav.EPAM_HW_7_1206;

import info.vladyslav.EPAM_HW_7_1206.view.AccountView;

import java.io.IOException;

public class AppRunner {
    public static void main(String[] args) throws IOException {
        AccountView accountView = new AccountView();
        accountView.viewAccountMenu();
    }
}
