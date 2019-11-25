package info.vladyslav.EPAM_WH_4_1118;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {

    @Test
    public void getTotalAmountNotNull() {
        View view = new View();
        assertNotNull(view);
    }

    @Test
    public void getTotalAmount() {
        View view = new View();
        assertTrue(view.getTotalAmount() == 0.0);
    }

}