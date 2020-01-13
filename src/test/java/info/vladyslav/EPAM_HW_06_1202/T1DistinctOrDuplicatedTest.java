package info.vladyslav.EPAM_HW_06_1202;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class T1DistinctOrDuplicatedTest {
    private T1DistinctOrDuplicated t1DistinctOrDuplicated = new T1DistinctOrDuplicated();
    private LinkedList<Integer> linkedList = new LinkedList<>();

    @Test
    public void contentsDuplicateCheck1() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(1);
        assertTrue(t1DistinctOrDuplicated.contentsDuplicateCheck(linkedList));
    }

    @Test
    public void contentsDuplicateCheck2() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        assertFalse(t1DistinctOrDuplicated.contentsDuplicateCheck(linkedList));
    }

    @Test
    public void contentsDuplicateCheck3() {
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        assertTrue(t1DistinctOrDuplicated.contentsDuplicateCheck(linkedList));
    }
}