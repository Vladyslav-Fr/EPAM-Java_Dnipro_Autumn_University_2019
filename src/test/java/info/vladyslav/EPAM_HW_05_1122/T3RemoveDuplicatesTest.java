package info.vladyslav.EPAM_HW_05_1122;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;


public class T3RemoveDuplicatesTest {


    @Test
    public void removeDuplicats1() {
        T3RemoveDuplicates t3RemoveDuplicates = new T3RemoveDuplicates();
        t3RemoveDuplicates.setList(new LinkedList<Integer>());
        t3RemoveDuplicates.getList().add(1);
        t3RemoveDuplicates.getList().add(1);
        t3RemoveDuplicates.getList().add(2);

        t3RemoveDuplicates.removeDuplicats();

        LinkedList test = new LinkedList();
        test.add(1);
        test.add(2);

        assertEquals(test, t3RemoveDuplicates.getList());
    }

    @Test
    public void removeDuplicats2() {
        T3RemoveDuplicates t3RemoveDuplicates = new T3RemoveDuplicates();
        t3RemoveDuplicates.setList(new LinkedList<Integer>());
        t3RemoveDuplicates.getList().add(0);
        t3RemoveDuplicates.getList().add(0);
        t3RemoveDuplicates.getList().add(1);
        t3RemoveDuplicates.getList().add(1);
        t3RemoveDuplicates.getList().add(1);
        t3RemoveDuplicates.getList().add(2);
        t3RemoveDuplicates.getList().add(2);
        t3RemoveDuplicates.getList().add(3);
        t3RemoveDuplicates.getList().add(3);
        t3RemoveDuplicates.getList().add(4);

        t3RemoveDuplicates.removeDuplicats();

        LinkedList test = new LinkedList();
        test.add(0);
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        assertEquals(test, t3RemoveDuplicates.getList());
    }
}