package info.vladyslav.EPAM_HW_9_1223.behavioral.strategy;

import info.vladyslav.EPAM_HW_9_1223.behavioral.state.Activity;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
