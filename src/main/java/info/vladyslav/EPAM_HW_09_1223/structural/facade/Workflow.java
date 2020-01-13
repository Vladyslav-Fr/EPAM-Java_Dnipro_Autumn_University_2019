package info.vladyslav.EPAM_HW_09_1223.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobeBeforeDeadLine(bugTracker);
    }
}
