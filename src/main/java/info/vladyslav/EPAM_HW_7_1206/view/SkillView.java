package info.vladyslav.EPAM_HW_7_1206.view;

import info.vladyslav.EPAM_HW_7_1206.controller.AccountController;

import java.io.IOException;
import java.util.Scanner;

public class SkillView {
    Scanner scannerForStrings = new Scanner(System.in);
    Scanner scannerForLongs = new Scanner(System.in);
    AccountController accountController = new AccountController();


    private static final String ACCOUNT_VIEW_MENU = "Make your choice\n" +
            "1. create account\n" +
            "2. show all accounts (read all)\n" +
            "3. show account by id (read)\n" +
            "4. update account name\n" +
            "5. ban account\n" +
            "6. delete account\n" +
            "7. exit";

    public void viewAccountMenu() throws IOException {

        int numberOfChoce = 0;
        Scanner getConsoleNuber = new Scanner(System.in);
        while (numberOfChoce != 7) {
            System.out.println(ACCOUNT_VIEW_MENU);
            numberOfChoce = getConsoleNuber.nextInt();

            switch (numberOfChoce) {
                case 1:
                    System.out.println("Enter your account name: ");
                    String information = scannerForStrings.nextLine();
                    System.out.println(accountController.addNewAccount(information));
                    break;

                case 2:
                    accountController.getAllFromRepo();
                    break;

                case 3:
                    System.out.println("Enter id: ");
                    long imputIdForShow = scannerForLongs.nextLong();
                    accountController.getAccountById(imputIdForShow);
                    break;

                case 4:
                    System.out.println("Enter id for update: ");
                    long idForUpdate = scannerForLongs.nextLong();
                    System.out.println("Enter new account name for update: ");
                    String informationForUpdate = scannerForStrings.nextLine();
                    accountController.setAccountUpdate(idForUpdate, informationForUpdate);
                    break;

                case 5:
                    System.out.println("Enter id for ban: ");
                    long idForBan = scannerForLongs.nextLong();
                    accountController.setAccountBan(idForBan);
                    break;

                case 6:
                    System.out.println("Enter id for delete account: ");
                    long idForDelete = scannerForLongs.nextLong();
                    accountController.setAccountDeleteStatus(idForDelete);
                    break;
            }
        }
    }
}
