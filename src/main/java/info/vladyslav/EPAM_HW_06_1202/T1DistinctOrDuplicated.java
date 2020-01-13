package info.vladyslav.EPAM_HW_06_1202;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Task 1
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

public class T1DistinctOrDuplicated {

    boolean contentsDuplicateCheck(LinkedList<Integer> integers) {
        HashSet<Integer> hashSetForDuplicateDelete = new HashSet<>();
        hashSetForDuplicateDelete.addAll(integers);
        return integers.size() != hashSetForDuplicateDelete.size();
    }
}
