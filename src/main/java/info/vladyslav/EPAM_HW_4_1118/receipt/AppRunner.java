package info.vladyslav.EPAM_HW_4_1118.receipt;

/**
 * Task 2
 * Implement console application that gets from console data about total amount.
 * Application should calculate discount:
 * 0 - 500 -> 5%
 * 501 - 1000 -> 10%
 * > 1001 -> 15% *
 * <p>
 * After this application should show in console information about receipt that contains:
 * - Date
 * - Total amount
 * - Discount
 * - Amount to pay with discount
 * <p>
 * All methods should be covered with unit tests
 */

public class AppRunner {
    public static void main(String[] args) {
        BisunessLogic bisunessLogic = new BisunessLogic();
        bisunessLogic.run();
    }
}
