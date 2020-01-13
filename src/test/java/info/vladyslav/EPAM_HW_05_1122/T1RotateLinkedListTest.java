package info.vladyslav.EPAM_HW_05_1122;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class T1RotateLinkedListTest {

    @Test
    public void notNull() {
        T1RotateLinkedList t1RotateLinkedList = new T1RotateLinkedList(new LinkedList<Integer>());
        assertNotNull(t1RotateLinkedList);
    }

    @Test
    public void basicContent() {
        T1RotateLinkedList t1RotateLinkedList = new T1RotateLinkedList(new LinkedList<Integer>());

        LinkedList test = new LinkedList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        assertEquals(t1RotateLinkedList.getRotor(), test);
    }

    @Test
    public void rotateTwoStepsRight() {
        T1RotateLinkedList t1RotateLinkedList = new T1RotateLinkedList(new LinkedList<Integer>());
        t1RotateLinkedList.shiftRight(2);

        LinkedList test = new LinkedList();
        test.add(4);
        test.add(5);
        test.add(1);
        test.add(2);
        test.add(3);

        assertEquals(t1RotateLinkedList.getRotor(), test);
    }

    @Test
    public void example2Test() {
        T1RotateLinkedList t1RotateLinkedList = new T1RotateLinkedList(new LinkedList<Integer>());
        t1RotateLinkedList.getRotor().clear();
        t1RotateLinkedList.getRotor().add(0);
        t1RotateLinkedList.getRotor().add(1);
        t1RotateLinkedList.getRotor().add(2);

        t1RotateLinkedList.shiftRight(4);
        LinkedList test = new LinkedList();
        test.add(2);
        test.add(0);
        test.add(1);
        assertEquals(t1RotateLinkedList.getRotor(), test);
    }

}