package info.vladyslav.EPAM_HW_4_1118.receipt;

import java.util.Date;
import java.util.Scanner;

class AppView {
    private static final String ENTER_TOTAL_AMOUNT = "Please enter the total amount";
    private static final String DATE = "- Date: ";
    private static final String TOTAL_AMOUNT = "\n- Total amount: ";
    private static final String DISCOUNT = "\n- Discount: ";
    private static final String AMOUNT_WITH_DISCOUNT = "\n- Amount to pay with discount: ";
    private static final String PERSENT_OR = "% or ";

    private double totalAmount;

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_TOTAL_AMOUNT);
        totalAmount = sc.nextDouble();
        sc.close();
    }

    void showReceipt(double totalAmount, double discount) {
        Date date = new Date();
        System.out.println(DATE + date.toString() +
                TOTAL_AMOUNT + totalAmount +
                DISCOUNT + (discount * 100) + PERSENT_OR + (discount * totalAmount) +
                AMOUNT_WITH_DISCOUNT + (totalAmount - (discount * totalAmount)));
    }

}