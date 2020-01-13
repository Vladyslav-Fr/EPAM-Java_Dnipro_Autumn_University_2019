package info.vladyslav.EPAM_HW_04_1118.receipt;

import java.util.Scanner;

class AppView {
    private static final String ENTER_TOTAL_AMOUNT = "Please enter the total amount:";
    private static final String DATE = "- Date: ";
    private static final String TOTAL_AMOUNT = "\n- Total amount: ";
    private static final String DISCOUNT = "\n- Discount: ";
    private static final String AMOUNT_WITH_DISCOUNT = "\n- Amount to pay with discount: ";
    private static final String PERSENT_OR = "% or ";

    double setTotalAmount() {
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_TOTAL_AMOUNT);
        amount = sc.nextDouble();
        sc.close();
        return amount;
    }

    void showReceipt(String date, double totalAmount, double discount, double totalAmountWithDiscount) {
        System.out.println(DATE + date +
                TOTAL_AMOUNT + totalAmount +
                DISCOUNT + (discount * 100) + PERSENT_OR + (discount * totalAmount) +
                AMOUNT_WITH_DISCOUNT + totalAmountWithDiscount);
    }

}