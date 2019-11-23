package info.vladyslav.EPAM_WH_4_1115;

import java.util.Arrays;

public class RockScissorsPaperGameRunner {
    public static void main(String[] args) {

        RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();
        rockScissorsPaperGameLogic.run();
        System.out.println(Arrays.toString(RockScissorsPaperGameLogic.Figures.values()));
    }
}
