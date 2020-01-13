package info.vladyslav.EPAM_HW_9_1223.behavioral.chainOfResponsibility;

public class EmailNotifier extends Notifier{
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void wright(String message) {
        System.out.println("Sending email: " + message);
    }
}
