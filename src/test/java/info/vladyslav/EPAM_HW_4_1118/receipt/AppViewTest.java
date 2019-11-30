package info.vladyslav.EPAM_HW_4_1118.receipt;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppViewTest {

    @Test
    public void getTotalAmountNotNull() {
        AppView appView = new AppView();
        assertNotNull(appView);
    }

    @Test
    public void getTotalAmount() {
        AppView appView = new AppView();
        assertTrue(appView.getTotalAmount() == 0.0);
    }

}