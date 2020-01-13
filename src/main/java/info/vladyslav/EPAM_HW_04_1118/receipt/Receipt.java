package info.vladyslav.EPAM_HW_04_1118.receipt;

import java.util.Date;

class Receipt {
    private String date;
    private double totalAmount;
    private double discount;
    private double tolalAmountWithDiscount;

    double getDiscount() {
        return discount;
    }

    void setDiscount(double amount) {
        if (amount <= 500) {
            this.discount = 0.05;
        } else if (amount <= 1000) {
            this.discount = 0.1;
        } else {
            this.discount = 0.15;
        }
    }

    String getDate() {
        return date;
    }

    void setCurrentDate() {
        Date date = new Date();
        this.date = date.toString();
    }

    double getTotalAmount() {
        return totalAmount;
    }

    void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    double getTolalAmountWithDiscount() {
        return tolalAmountWithDiscount;
    }

    void setTolalAmountWithDiscount(double tolalAmountWithDiscount) {
        this.tolalAmountWithDiscount = tolalAmountWithDiscount;
    }
}
