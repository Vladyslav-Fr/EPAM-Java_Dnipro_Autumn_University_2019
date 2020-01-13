package info.vladyslav.EPAM_HW_03_1115;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperGameLogic {
    enum Figures {
        ROCK, SCISSORS, PAPER
    }

    private static final String ENTER_NUM = "Enter a number from 1 to 3. \n1 = Rock; \n2 = Scissors; \n3 = Paper";
    private static final String INVALID_INPUT_DIGIT = "\"Invalid input. Your choice is outside the range of 1-3 digits!\nPlease re-enter!";
    private static final String INVALID_INPUT_NOT_NUM = "Invalid input. It's not a number. Please re-enter!";
    private static final String WIN = "You are win! Congrats!";
    private static final String DROWN = "Drown";
    private static final String LOSE = "You are lose! Better luck next time";
    private static final String COMPUTER_SELECT = "Computer select is: ";
    private static final String PLAYER_CHOSE = " and the player chose: ";

    private Figures computerSelection;
    private Figures choiceOfPlayer;

    public Figures getComputerSelection() {
        return computerSelection;
    }

    public Figures getChoiceOfPlayer() {
        return choiceOfPlayer;
    }

    void run() {
        setRandomComputerSelection();
        setChoiceOfPlayer();
        results();
    }

    Figures setRandomComputerSelection() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return this.computerSelection = Figures.ROCK;
            case 1:
                return this.computerSelection = Figures.SCISSORS;
            case 2:
                return this.computerSelection = Figures.PAPER;
        }
        return null;
    }

    Figures setChoiceOfPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_NUM);
        int operationNumber;
        if (sc.hasNextInt()) {
            operationNumber = sc.nextInt();
            if (operationNumber >= 1 && operationNumber <= 3) {
                switch (operationNumber) {
                    case 1:
                        return this.choiceOfPlayer = Figures.ROCK;
                    case 2:
                        return this.choiceOfPlayer = Figures.SCISSORS;
                    case 3:
                        return this.choiceOfPlayer = Figures.PAPER;
                }
                return setChoiceOfPlayer();
            } else {
                System.out.println(INVALID_INPUT_DIGIT);
                return setChoiceOfPlayer();
            }
        } else {
            System.out.println(INVALID_INPUT_NOT_NUM);
            return setChoiceOfPlayer();
        }
    }

    void results() {
        if (choiceOfPlayer == Figures.ROCK && computerSelection == Figures.SCISSORS ||
                choiceOfPlayer == Figures.SCISSORS && computerSelection == Figures.PAPER ||
                choiceOfPlayer == Figures.PAPER && computerSelection == Figures.ROCK) {
            System.out.println(WIN);
        } else if (choiceOfPlayer == computerSelection) {
            System.out.println(DROWN);
        } else {
            System.out.println(LOSE);
        }
        System.out.println(COMPUTER_SELECT + computerSelection + PLAYER_CHOSE + choiceOfPlayer);
    }
}
