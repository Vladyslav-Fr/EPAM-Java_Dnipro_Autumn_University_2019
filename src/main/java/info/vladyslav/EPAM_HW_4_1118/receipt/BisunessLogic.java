package info.vladyslav.EPAM_HW_4_1118.receipt;

class BisunessLogic {

    void run() {
        AppView appView = new AppView();
        appView.setTotalAmount();
        Model model = new Model();
        model.setDiscount(appView.getTotalAmount());
        appView.showReceipt(appView.getTotalAmount(), model.getDiscount());
    }
}
