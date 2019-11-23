package info.vladyslav.EPAM_WH_4_1115;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperGameLogic {
    enum Figures {
        ROCK, SCISSORS, PAPER
        }

    private Figures computerSelection;
    private Figures choiceOfGamer;
/*    public static void main(String[] args) {
        RockScissorsPaperGameLogic rockScissorsPaperGameLogic = new RockScissorsPaperGameLogic();
        Figures iii = Figures.PAPER;
        System.out.println(iii);

    }*/


    void run(){
        setRandomComputerSelection();
        setChoiceOfGamer();
        results();
    }

    void setRandomComputerSelection() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                this.computerSelection = Figures.ROCK;
                break;
            case 1:
                this.computerSelection = Figures.SCISSORS;
                break;
            case 2:
                this.computerSelection = Figures.PAPER;
                break;
        }
    }

    public Figures setChoiceOfGamer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3. \n1 = Rock; \n2 = Scissors; \n3 = Paper");
        int operationNumber;
        if (sc.hasNextInt()) {
            operationNumber = sc.nextInt();
            if (operationNumber>=1 && operationNumber <=3){
            switch (operationNumber) {
                case 1:
                    choiceOfGamer = Figures.ROCK;
                    break;
                case 2:
                    choiceOfGamer = Figures.SCISSORS;
                    break;
                case 3:
                    choiceOfGamer = Figures.PAPER;
                    break;
            }
            return choiceOfGamer;}
            else {
                System.out.println("Invalid input. Your choice is outside the range of 1-3 digits! " +
                        "Please re-enter!");
                return setChoiceOfGamer();
            }
        } else {
            System.out.println("Invalid input. It's not a number. Please re-enter!");
            return setChoiceOfGamer();
        }
    }

    void results(){
        if (this.computerSelection.equals(this.choiceOfGamer)){
            System.out.println("You are win! Congrats!");
        } else {
            System.out.println("You are lose! Better luck next time");
        }
    }



}
