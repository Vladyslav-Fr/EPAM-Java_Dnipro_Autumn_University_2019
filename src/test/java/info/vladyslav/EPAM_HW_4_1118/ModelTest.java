package info.vladyslav.EPAM_HW_4_1118;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    Model model = new Model();

    @Test
    public void getDiscount1() {
        model.setDiscount(500);
        assertTrue(model.getDiscount() == 0.05);
    }

    @Test
    public void getDiscount2() {
        model.setDiscount(501);
        assertTrue(model.getDiscount() == 0.1);
    }

    @Test
    public void getDiscount3() {
        model.setDiscount(1000);
        assertTrue(model.getDiscount() == 0.1);
    }

    @Test
    public void getDiscount4() {
        model.setDiscount(1001);
        assertTrue(model.getDiscount() == 0.15);
    }


}