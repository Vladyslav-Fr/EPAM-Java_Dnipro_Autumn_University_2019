package info.vladyslav.EPAM_HW_4_1118.receipt;

class BisunessLogic {

    void run() {
        AppView appView = new AppView();
        appView.setTotalAmount();
        Receipt receipt = new Receipt();
        receipt.setDiscount(appView.getTotalAmount());
        appView.showReceipt(appView.getTotalAmount(), receipt.getDiscount());
    }
}
