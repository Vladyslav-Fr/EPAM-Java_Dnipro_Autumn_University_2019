package info.vladyslav.EPAM_HW_9_1223.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}