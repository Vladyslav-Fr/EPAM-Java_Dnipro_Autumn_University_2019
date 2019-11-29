package info.vladyslav.EPAM_HW_5_1122;

import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class T4ConvertHeightBalancedBSTTest {

    @Test
    public void convertToHiBalance() {
        T4ConvertHeightBalancedBST t4ConvertHeightBalancedBST = new T4ConvertHeightBalancedBST();
        t4ConvertHeightBalancedBST.setIntegers(new TreeSet<Integer>());
        t4ConvertHeightBalancedBST.convertToHiBalance();

        TreeSet<Integer> test = new TreeSet<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(8);
        test.add(9);

        assertEquals(t4ConvertHeightBalancedBST.getIntegers(), test);
    }
}