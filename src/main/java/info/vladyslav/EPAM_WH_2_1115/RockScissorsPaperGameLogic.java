package info.vladyslav.EPAM_WH_2_1115;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperGameLogic {
    private static final String ROCK = "Rock";
    private static final String SCISSORS = "Scissors";
    private static final String PAPER = "Paper";

    private String choseOfComputer;
    private String choseOfGamer;

    public String getChoseOfComputer() {
        return choseOfComputer;
    }

    void randomChose() {
        int i;
        Random random = new Random();
        i = random.nextInt(3);
        switch (i) {
            case 0:
                this.choseOfComputer = ROCK;
                break;
            case 1:
                this.choseOfComputer = SCISSORS;
                break;
            case 2:
                this.choseOfComputer = PAPER;
                break;
        }
        System.out.println(i);
    }

    public int getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number from 1 to 3. \n1 = Rock; \n2 = Scissors; \n3 = Paper");
        int operationNumber;
        if (sc.hasNextInt()) {
            operationNumber = sc.nextInt();
            switch (operationNumber) {
                case 1:
                    choseOfGamer = "Rock";
                    break;
                case 2:
                    choseOfGamer = "Scissors";
                    break;
                case 3:
                    choseOfGamer = "Paper";
                    break;
            }
            return operationNumber;
        } else {
            System.out.println("You are wrong! It's not a number. Please re-enter!");
            return getOperation();
        }
    }

    void results(){
        if (this.choseOfComputer == this.choseOfGamer){
            System.out.println("You are win! Congrats!");
        } else {
            System.out.println("You are lose! Better next time");
        }
        System.out.println("");
    }



}
