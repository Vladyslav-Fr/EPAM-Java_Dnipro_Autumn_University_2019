package info.vladyslav.EPAM_WH_2_1111;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestT1 {
    private T1ContiguousSubarrayLargestSum test1 = new T1ContiguousSubarrayLargestSum();

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(test1.run(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
        assertEquals(test1.run(new int[]{0,0,0,1,1,1,0}), 3);
        assertEquals(test1.run(new int[]{9,0,-5,1,1,1,0}), 9);
        assertEquals(test1.run(new int[]{9,-4,-5,1,1,1,9}), 12);
    }
}
