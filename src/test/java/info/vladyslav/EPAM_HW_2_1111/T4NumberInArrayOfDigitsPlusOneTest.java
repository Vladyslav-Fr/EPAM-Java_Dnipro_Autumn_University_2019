package info.vladyslav.EPAM_HW_2_1111;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class T4NumberInArrayOfDigitsPlusOneTest {
    private T4NumberInArrayOfDigitsPlusOne testT4 = new T4NumberInArrayOfDigitsPlusOne();

    @Test
    public void setTestT4n1() {
        assertEquals(Arrays.toString(testT4.run(new int[]{1, 2, 3})), "[1, 2, 4]");
    }
    @Test
    public void setTestT4n2() {
        assertEquals(Arrays.toString(testT4.run(new int[]{4, 3, 2, 1})), "[4, 3, 2, 2]");
    }
    @Test
    public void setTestT4n3() {
        assertEquals(Arrays.toString(testT4.run(new int[]{9, 2, 9})), "[9, 3, 0]");
    }
    @Test
    public void setTestT4n4() {
        assertEquals(Arrays.toString(testT4.run(new int[]{9, 9, 9})), "[1, 0, 0, 0]");
    }
}
