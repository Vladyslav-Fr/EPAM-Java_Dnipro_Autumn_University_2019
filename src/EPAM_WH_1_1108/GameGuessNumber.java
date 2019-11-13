package EPAM_WH_1_1108;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    private static final String GUESS_AND_ENTER = "Guess the number game. \nEnter an integer number from 0 to 1000: ";
    private static final String TO_HIGH = "Too high. Enter next an integer number: ";
    private static final String TO_LOW = "Too low. Enter next an integer number: ";
    private static final String WARMER_BUT_HIGH = "Warmer but high. Enter next an integer number: ";
    private static final String WARMER_BUT_LOW = "Warmer but low. Enter next an integer number: ";
    private static final String CONGRATS = "\nGotcha! Congrats!!! \nThe hidden number is: ";
    private static final String ATTEMPTS = "Number of attempts is: ";
    private static final String WRONG = "You are wrong! It's not an integer. Please re-enter the correct number: ";

    public static void main(String[] args) {
        GameGuessNumber gameGuessNumber = new GameGuessNumber();
        gameGuessNumber.game();
    }

    private void game() {
        int ranNum, enterNum, attempts = 0, warmer = 10;
        ranNum = randomIntNumFrom0to1000();

        System.out.print(GUESS_AND_ENTER);
        do {
            enterNum = setNum();
            if (enterNum > ranNum) {
                if ((enterNum - ranNum) > warmer) {
                    System.out.print(TO_HIGH);
                } else {
                    System.out.print(WARMER_BUT_HIGH);
                }
            } else if (enterNum < ranNum) {
                if ((ranNum - enterNum) > warmer) {
                    System.out.print(TO_LOW);
                } else {
                    System.out.print(WARMER_BUT_LOW);
                }
            } else {
                System.out.print(CONGRATS + ranNum);
            }
            attempts++;

        } while (enterNum != ranNum);

        System.out.println(ATTEMPTS + attempts);
    }

    private int randomIntNumFrom0to1000() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    private int setNum() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.print(WRONG);
            return setNum();
        }
    }
}
