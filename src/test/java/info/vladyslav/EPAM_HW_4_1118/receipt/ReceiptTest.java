package info.vladyslav.EPAM_HW_4_1118.receipt;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ReceiptTest {
    private Receipt receipt = new Receipt();

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

    @Test
    public void dateVoidTest() {
        assertNull(receipt.getDate());
    }

    @Test
    public void dateTest() {
        Date date = new Date();
        receipt.setCurrentDate();
        assertEquals(date.toString(), receipt.getDate());
    }

    @Test
    public void totalAmount1VoidTest() {
        assertTrue(receipt.getTotalAmount() == 0.0);
    }

    @Test
    public void totalAmount2Test() {
        receipt.setTotalAmount(500.5);
        assertTrue(receipt.getTotalAmount() == 500.5);
    }

    @Test
    public void totalAmountWithDiscount1VoidTest() {
        assertTrue(receipt.getTolalAmountWithDiscount() == 0.0);
    }

    @Test
    public void totalAmountWithDiscount2Test() {
        receipt.setTolalAmountWithDiscount(485.5);
        assertTrue(receipt.getTolalAmountWithDiscount() == 485.5);
    }


}