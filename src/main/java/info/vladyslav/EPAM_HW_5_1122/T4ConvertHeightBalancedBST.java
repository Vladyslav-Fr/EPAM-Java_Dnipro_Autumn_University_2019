package info.vladyslav.EPAM_HW_5_1122;

import java.util.TreeSet;

/**
 * Task 4
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth
 * of the two subtrees of every node never differ by more than 1.
 */


public class T4ConvertHeightBalancedBST {

    private int[] array = {1, 2, 3, 4, 5, 6, 8, 9};
    private TreeSet<Integer> integers;

    public void setIntegers(TreeSet<Integer> integers) {
        this.integers = integers;
    }

    public TreeSet<Integer> getIntegers() {
        return integers;
    }

    void convertToHiBalance() {
        for (int i : array) {
            integers.add(i);
        }
    }
}
