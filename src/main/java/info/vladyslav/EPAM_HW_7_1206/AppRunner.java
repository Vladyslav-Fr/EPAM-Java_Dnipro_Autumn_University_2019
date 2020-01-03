package info.vladyslav.EPAM_HW_7_1206;

import info.vladyslav.EPAM_HW_7_1206.view.SkillView;

import java.io.IOException;

public class AppRunner {
    public static void main(String[] args) throws IOException {
        SkillView skillView = new SkillView();
        skillView.viewSkillMenu();
    }
}
