package info.vladyslav.EPAM_HW_6_1202;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class T2SifferenceAtMostKorNotTest {

    private T2SifferenceAtMostKorNot t2SifferenceAtMostKorNot = new T2SifferenceAtMostKorNot();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    @Test
    public void containsNearbyDuplicate1() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        assertTrue(t2SifferenceAtMostKorNot.containsNearbyDuplicate(linkedList, 3));
    }

    @Test
    public void containsNearbyDuplicate2() {
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(1);
        assertTrue(t2SifferenceAtMostKorNot.containsNearbyDuplicate(linkedList, 1));
    }

    @Test
    public void containsNearbyDuplicate3() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        assertFalse(t2SifferenceAtMostKorNot.containsNearbyDuplicate(linkedList, 2));
    }
}