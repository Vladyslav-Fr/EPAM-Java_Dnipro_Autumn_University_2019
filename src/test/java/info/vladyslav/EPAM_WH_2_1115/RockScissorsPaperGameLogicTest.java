package info.vladyslav.EPAM_WH_2_1115;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockScissorsPaperGameLogicTest {

    @Test
    public void randomChose() {
        RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();


        assertEquals(rockScissorsPaperGameLogic.randomChose(),rockScissorsPaperGameLogic.getChoseOfComputer());
    }
}