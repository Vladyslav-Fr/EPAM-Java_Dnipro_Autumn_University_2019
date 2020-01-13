package info.vladyslav.EPAM_HW_06_1202;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class T4OccursTwiceAndMissingTest {
    T4OccursTwiceAndMissing t4OccursTwiceAndMissing = new T4OccursTwiceAndMissing();
    ArrayList<Integer> integers = new ArrayList<>();
    ArrayList<Integer> compare = new ArrayList<>();

    @Test
    public void occursTwiceAndMissing1() {
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(4);

        compare.add(2);
        compare.add(3);
        assertEquals(t4OccursTwiceAndMissing.occursTwiceAndMissing(integers), compare);
    }

    @Test
    public void occursTwiceAndMissing2() {
        integers.add(1);
        integers.add(3);
        integers.add(3);
        integers.add(7);

        compare.add(3);
        compare.add(5);
        assertEquals(t4OccursTwiceAndMissing.occursTwiceAndMissing(integers), compare);
    }

    @Test
    public void occursTwiceAndMissing3() {
        integers.add(1);
        integers.add(4);
        integers.add(7);
        integers.add(10);
        integers.add(10);
        integers.add(16);

        compare.add(10);
        compare.add(13);
        assertEquals(t4OccursTwiceAndMissing.occursTwiceAndMissing(integers), compare);
    }
}