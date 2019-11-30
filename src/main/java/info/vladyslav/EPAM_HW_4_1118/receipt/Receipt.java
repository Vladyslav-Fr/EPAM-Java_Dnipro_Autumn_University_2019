package info.vladyslav.EPAM_HW_4_1118.receipt;

class Receipt {
    String date;
    double amount;
    private double discount;
    double tolalAmount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double amount) {
        if (amount <= 500) {
            this.discount = 0.05;
        } else if (amount <= 1000) {
            this.discount = 0.1;
        } else {
            this.discount = 0.15;
        }
    }
}
