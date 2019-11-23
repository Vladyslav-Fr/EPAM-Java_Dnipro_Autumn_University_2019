package info.vladyslav.EPAM_WH_3_1111;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1ContiguousSubarrayLargestSumTest {
    private T1ContiguousSubarrayLargestSum test1 = new T1ContiguousSubarrayLargestSum();

    @Test
    public void shouldCreateDefaultArrayTestN1() {
        assertEquals(test1.run(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
    }

    @Test
    public void shouldCreateDefaultArrayTestN2() {
        assertEquals(test1.run(new int[]{0,0,0,1,1,1,0}), 3);
    }

    @Test
    public void shouldCreateDefaultArrayTestN3() {
        assertEquals(test1.run(new int[]{9,0,-5,1,1,1,0}), 9);
    }

    @Test
    public void shouldCreateDefaultArrayTestN4() {
        assertEquals(test1.run(new int[]{9,-4,-5,1,1,1,9}), 12);
    }
}
