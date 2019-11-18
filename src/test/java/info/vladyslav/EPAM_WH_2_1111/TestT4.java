package info.vladyslav.EPAM_WH_2_1111;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestT4 {
    private T4NumberInArrayOfDigitsPlusOne testT4 = new T4NumberInArrayOfDigitsPlusOne();

    @Test
    public void setTestT4() {
        assertEquals(Arrays.toString(testT4.run(new int[]{1, 2, 3})), "[1, 2, 4]");
        assertEquals(Arrays.toString(testT4.run(new int[]{4, 3, 2, 1})), "[4, 3, 2, 2]");
        assertEquals(Arrays.toString(testT4.run(new int[]{9, 2, 9})), "[9, 3, 0]");
        assertEquals(Arrays.toString(testT4.run(new int[]{9, 9, 9})), "[1, 0, 0, 0]");
    }
}
