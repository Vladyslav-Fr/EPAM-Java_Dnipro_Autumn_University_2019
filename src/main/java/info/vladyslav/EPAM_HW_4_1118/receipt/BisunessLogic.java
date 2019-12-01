package info.vladyslav.EPAM_HW_4_1118.receipt;

class BisunessLogic {

    void run() {
        AppView appView = new AppView();
        Receipt receipt = new Receipt();
        receipt.setCurrentDate();
        receipt.setTotalAmount(appView.setTotalAmount());
        receipt.setDiscount(receipt.getTotalAmount());
        receipt.setTolalAmountWithDiscount(receipt.getTotalAmount() - (receipt.getTotalAmount() * receipt.getDiscount()));
        appView.showReceipt(receipt.getDate(), receipt.getTotalAmount(), receipt.getDiscount(), receipt.getTolalAmountWithDiscount());
    }
}
