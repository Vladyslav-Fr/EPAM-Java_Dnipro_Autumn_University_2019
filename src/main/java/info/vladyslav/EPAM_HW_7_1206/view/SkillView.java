package info.vladyslav.EPAM_HW_7_1206.view;

import info.vladyslav.EPAM_HW_7_1206.controller.SkillController;

import java.io.IOException;
import java.util.Scanner;

public class SkillView {
    Scanner scannerForStrings = new Scanner(System.in);
    Scanner scannerForLongs = new Scanner(System.in);
    SkillController skillController = new SkillController();


    private static final String SKILL_VIEW_MENU = "Make your choice\n" +
            "1. create skill\n" +
            "2. show all skills (read all)\n" +
            "3. show skill by id (read)\n" +
            "4. update skill\n" +
            "5. delete skill\n" +
            "6. exit";

    public void viewSkillMenu() throws IOException {

        int numberOfChoce = 0;
        Scanner getConsoleNuber = new Scanner(System.in);
        while (numberOfChoce != 6) {
            System.out.println(SKILL_VIEW_MENU);
            numberOfChoce = getConsoleNuber.nextInt();

            switch (numberOfChoce) {
                case 1:
                    System.out.println("Enter the skill you want to create: ");
                    String information = scannerForStrings.nextLine();
                    System.out.println(skillController.addNewSkill(information));
                    break;

                case 2:
                    skillController.getAllFromRepo();
                    break;

                case 3:
                    System.out.println("Enter id: ");
                    long imputIdForShow = scannerForLongs.nextLong();
                    skillController.getSkillById(imputIdForShow);
                    break;

                case 4:
                    System.out.println("Enter id for update: ");
                    long idForUpdate = scannerForLongs.nextLong();
                    System.out.println("Enter new skill name for update: ");
                    String informationForUpdate = scannerForStrings.nextLine();
                    skillController.setSkillUpdate(idForUpdate, informationForUpdate);
                    break;

                case 5:
                    System.out.println("Enter id for delete: ");
                    long idForDelete = scannerForLongs.nextLong();
                    skillController.deleteSkill(idForDelete);
                    break;
            }
        }
    }
}
