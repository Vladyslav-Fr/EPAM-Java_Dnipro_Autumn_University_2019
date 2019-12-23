package info.vladyslav.EPAM_HW_7_1206.view;

import java.util.Scanner;

public class AccountView {
    public static final String ACCOUNT_VIEW_MENU = "Make your choice\n" +
            "1. create account\n"+
            "2. show account by id (read)\n"+
            "3. show all accounts (read all)\n"+
            "4. update number of account\n"+
            "5. ban account\n"+
            "6. delete account\n"+
            "7. exit";

    void viewAccountMenu(){

        int numberOfChoce = 0;
        Scanner getConsoleNuber = new Scanner(System.in);
        while (numberOfChoce != 7){
            System.out.println(ACCOUNT_VIEW_MENU);
            numberOfChoce = getConsoleNuber.nextInt();

            switch (numberOfChoce){
                case 1:
                    System.out.println("");
            }

        }
    }





}
