package info.vladyslav.EPAM_HW_06_1202;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class T3AmountKindsOfCandiesTest {
    T3AmountKindsOfCandies t3AmountKindsOfCandies = new T3AmountKindsOfCandies();
    ArrayList<Integer> integers = new ArrayList<>();

    @Test
    public void maxAmountOfKindOfCandies1() {
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        assertEquals(t3AmountKindsOfCandies.maxAmountOfKindOfCandies(integers), 3);
    }

    @Test
    public void maxAmountOfKindOfCandies2() {
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        assertEquals(t3AmountKindsOfCandies.maxAmountOfKindOfCandies(integers), 2);
    }

    @Test
    public void maxAmountOfKindOfCandies3() {
        integers.add(1);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        assertEquals(t3AmountKindsOfCandies.maxAmountOfKindOfCandies(integers), 1);
    }
}