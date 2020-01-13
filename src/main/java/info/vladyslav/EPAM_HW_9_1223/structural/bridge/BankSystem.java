package info.vladyslav.EPAM_HW_9_1223.structural.bridge;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.wrightCode();
    }
}
