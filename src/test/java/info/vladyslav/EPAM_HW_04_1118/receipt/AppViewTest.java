package info.vladyslav.EPAM_HW_04_1118.receipt;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppViewTest {

    @Test
    public void getTotalAmountNotNull() {
        AppView appView = new AppView();
        assertNotNull(appView);
    }

}