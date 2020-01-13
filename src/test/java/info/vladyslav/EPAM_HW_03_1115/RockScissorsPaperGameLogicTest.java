package info.vladyslav.EPAM_HW_03_1115;


import org.junit.Test;


import static info.vladyslav.EPAM_HW_03_1115.RockScissorsPaperGameLogic.Figures.*;
import static org.junit.Assert.*;

public class RockScissorsPaperGameLogicTest {
    protected RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();

    @Test
    public void notNullForClass() {
        assertNotNull(rockScissorsPaperGameLogic);
    }

    @Test
    public void nullForCompSelect() {
        assertNull(rockScissorsPaperGameLogic.getComputerSelection());
    }

    @Test
    public void notNullForCompSelect() {
        rockScissorsPaperGameLogic.setRandomComputerSelection();
        assertNotNull(rockScissorsPaperGameLogic.getComputerSelection());
    }

    @Test
    public void nullForGamerSelect() {
        assertNull(rockScissorsPaperGameLogic.getChoiceOfPlayer());
    }

    @Test
    public void compSelectionRock() {
        assertEquals(ROCK, RockScissorsPaperGameLogic.Figures.values()[0]);
    }

    @Test
    public void compSelectionScissors() {
        assertEquals(SCISSORS, RockScissorsPaperGameLogic.Figures.values()[1]);
    }

    @Test
    public void compSelectionPaper() {
        assertEquals(PAPER, RockScissorsPaperGameLogic.Figures.values()[2]);
    }

}