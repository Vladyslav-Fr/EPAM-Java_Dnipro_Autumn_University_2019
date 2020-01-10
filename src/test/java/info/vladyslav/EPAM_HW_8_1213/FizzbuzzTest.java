package info.vladyslav.EPAM_HW_8_1213;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzbuzzTest {
    @Test
    public void mainTest() throws InterruptedException {
        Fizzbuzz fizzbuzz = new Fizzbuzz(15);
        assertEquals("1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz", fizzbuzz.getPrintMessage());
    }

    @Test
    public void testForNull() throws InterruptedException {
        Fizzbuzz fizzbuzz = new Fizzbuzz(0);
        assertNull(fizzbuzz.getPrintMessage());
    }
}