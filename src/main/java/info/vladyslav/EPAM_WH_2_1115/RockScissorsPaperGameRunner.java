package info.vladyslav.EPAM_WH_2_1115;

public class RockScissorsPaperGameRunner {
    public static void main(String[] args) {

        RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();
        rockScissorsPaperGameLogic.randomChose();
        rockScissorsPaperGameLogic.getOperation();
        rockScissorsPaperGameLogic.results();

    }
}
