package info.vladyslav.EPAM_HW_8_1213;

/**
 * Task 2
 * Write a program that outputs the string representation of numbers from 1 to n, however:
 * If the number is divisible by 3, output "fizz".
 * If the number is divisible by 5, output "buzz".
 * If the number is divisible by both 3 and 5, output "fizzbuzz".
 */

class Fizzbuzz {
    private int amount;
    private int currentNumber;
    private String printMessage;
    private Thread fizz;
    private Thread buzz;
    private Thread fizzbuzz;
    private Thread number;

    public Fizzbuzz(int amount) throws InterruptedException {
        this.amount = amount;
        printMessage = "";
        currentNumber = 1;
        startThreads();
        joinThreads();
    }

    private void startThreads() {
        this.fizz = new Thread(() -> {
            do {
                fizz();
            } while (currentNumber < amount);
        });
        this.buzz = new Thread(() -> {
            do {
                buzz();
            } while (currentNumber < amount);
        });
        this.fizzbuzz = new Thread(() -> {
            do {
                fizzbuzz();
            } while (currentNumber < amount);
        });
        this.number = new Thread(() -> {
            do {
                number();
            } while (currentNumber < amount);
        });
        fizz.start();
        buzz.start();
        fizzbuzz.start();
        number.start();
    }

    private void joinThreads() throws InterruptedException {
        fizz.join();
        buzz.join();
        fizzbuzz.join();
        number.join();
    }

    public String getPrintMessage() {
        return printMessage;
    }

    private synchronized void fizz() {
        while (currentNumber % 3 != 0 || currentNumber % 5 == 0) {
            try {
                if (currentNumber > amount) {
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.printMessage += "fizz, ";
        if (currentNumber == amount) {
            this.printMessage = printMessage.substring(0, printMessage.length() - 2);
        }
        currentNumber++;
        notifyAll();
    }

    private synchronized void buzz() {
        while (currentNumber % 5 != 0 || currentNumber % 3 == 0) {
            try {
                if (currentNumber > amount) {
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.printMessage += "buzz, ";
        if (currentNumber == amount) {
            this.printMessage = printMessage.substring(0, printMessage.length() - 2);
        }
        currentNumber++;
        notifyAll();
    }

    private synchronized void fizzbuzz() {
        while ((currentNumber % 3 != 0) || (currentNumber % 5 != 0)) {
            try {
                if (currentNumber > amount) {
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.printMessage += "fizzbuzz, ";
        if (currentNumber == amount) {
            this.printMessage = printMessage.substring(0, printMessage.length() - 2);
        }
        currentNumber++;
        notifyAll();
    }

    private synchronized void number() {
        while (currentNumber % 3 == 0 || currentNumber % 5 == 0) {
            try {
                if (currentNumber > amount) {
                    return;
                }
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (amount < currentNumber) {
            this.printMessage = null;
        } else {
            this.printMessage += currentNumber + ", ";
        }
        if (currentNumber == amount) {
            this.printMessage = printMessage.substring(0, printMessage.length() - 2);
        }
        currentNumber++;
        notifyAll();
    }
}