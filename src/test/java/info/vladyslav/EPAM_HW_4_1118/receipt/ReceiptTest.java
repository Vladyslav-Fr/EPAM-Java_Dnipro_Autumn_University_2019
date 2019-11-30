package info.vladyslav.EPAM_HW_4_1118.receipt;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReceiptTest {
    Receipt receipt = new Receipt();

    @Test
    public void getDiscount1() {
        receipt.setDiscount(500);
        assertTrue(receipt.getDiscount() == 0.05);
    }

    @Test
    public void getDiscount2() {
        receipt.setDiscount(501);
        assertTrue(receipt.getDiscount() == 0.1);
    }

    @Test
    public void getDiscount3() {
        receipt.setDiscount(1000);
        assertTrue(receipt.getDiscount() == 0.1);
    }

    @Test
    public void getDiscount4() {
        receipt.setDiscount(1001);
        assertTrue(receipt.getDiscount() == 0.15);
    }


}