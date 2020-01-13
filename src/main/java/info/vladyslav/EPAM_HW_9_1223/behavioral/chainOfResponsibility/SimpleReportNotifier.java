package info.vladyslav.EPAM_HW_9_1223.behavioral.chainOfResponsibility;

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void wright(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
