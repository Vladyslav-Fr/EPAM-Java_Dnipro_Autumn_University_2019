package EPAM_WH_1_1108;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {

    public static void main(String[] args) {
        int ranNum, enterNum, attempts = 0;

        GameGuessNumber gameGuessNumber = new GameGuessNumber();
        ranNum = gameGuessNumber.randomIntNum0_1000();

        System.out.println("Guess the number game. \nEnter an integer number from 0 to 1000");
        do {
            enterNum = gameGuessNumber.setNum();
            if (enterNum > ranNum) {
                if ((enterNum - ranNum)>10){
                System.out.println("Too high");}
                else {System.out.println("Warmer but high");}
            } else if (enterNum < ranNum) {
                if ((ranNum - enterNum)>10){
                    System.out.println("Too low");}
                else {System.out.println("Warmer but low");}
            } else {
                System.out.println("Gotcha! Congrats!!! \nThe hidden number is: " + ranNum);
            }
            attempts++;

        } while (enterNum != ranNum);

        System.out.println("Number of attempts is: " + attempts);

    }

    private int randomIntNum0_1000() {
        Random random = new Random();
        int r = random.nextInt(1000);
        return r;
    }

    private int setNum() {
        int operationNumber;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return operationNumber = sc.nextInt();
        } else {
            System.out.println("You are wrong! It's not an integer. Please re-enter!");
            return setNum();
        }
    }
}
