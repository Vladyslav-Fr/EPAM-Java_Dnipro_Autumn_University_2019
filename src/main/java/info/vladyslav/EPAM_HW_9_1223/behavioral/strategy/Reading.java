package info.vladyslav.EPAM_HW_9_1223.behavioral.strategy;

import info.vladyslav.EPAM_HW_9_1223.behavioral.state.Activity;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
