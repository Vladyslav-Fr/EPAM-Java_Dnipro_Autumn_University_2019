package info.vladyslav.EPAM_WH_4_1115;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockScissorsPaperGameLogicTest {

    @Test
    public void randomChose() {
        RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();
        assertEquals(rockScissorsPaperGameLogic.setChoiceOfGamer(),"Enter a number from 1 to 3. \n1 = Rock; \n2 = Scissors; \n3 = Paper");
    }
}