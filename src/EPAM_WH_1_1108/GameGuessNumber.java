package EPAM_WH_1_1108;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {

    public static void main(String[] args) {
        int ranNum, enterNum, attempts = 0;

        GameGuessNumber gameGuessNumber = new GameGuessNumber();
        ranNum = gameGuessNumber.randomIntNum0_1000();

        System.out.print("Guess the number game. \nEnter an integer number from 0 to 1000: ");
        do {
            enterNum = gameGuessNumber.setNum();
            if (enterNum > ranNum) {
                if ((enterNum - ranNum) > 10) {
                    System.out.print("Too high. Enter next an integer number: ");
                } else {
                    System.out.print("Warmer but high. Enter next an integer number: ");
                }
            } else if (enterNum < ranNum) {
                if ((ranNum - enterNum) > 10) {
                    System.out.print("Too low. Enter next an integer number: ");
                } else {
                    System.out.print("Warmer but low. Enter next an integer number: ");
                }
            } else {
                System.out.print("Gotcha! Congrats!!! \nThe hidden number is: " + ranNum);
            }
            attempts++;

        } while (enterNum != ranNum);

        System.out.println("Number of attempts is: " + attempts);

    }

    private int randomIntNum0_1000() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    private int setNum() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("You are wrong! It's not an integer. Please re-enter the correct number.");
            return setNum();
        }
    }
}
// comment for test
