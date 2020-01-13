package info.vladyslav.EPAM_HW_06_1202;

import java.util.ArrayList;

/**
 * Task 4
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error,
 * one of the numbers in the set got duplicated to another number in the set, which results
 * in repetition of one number and loss of another number.
 * Given an array nums representing the data status of this set after the error.
 * Your task is to firstly find the number occurs twice and then find the number that is missing.
 * Return them in the form of an array.
 * <p>
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 */


public class T4OccursTwiceAndMissing {

    ArrayList occursTwiceAndMissing(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> twiceAndMissing = new ArrayList<>();
        for (int i = 1; i < integerArrayList.size() - 1; i++) {
            if (integerArrayList.get(i).equals(integerArrayList.get(i + 1))) {
                twiceAndMissing.add(integerArrayList.get(i));
                twiceAndMissing.add((integerArrayList.get(i) - integerArrayList.get(i - 1)) + integerArrayList.get(i));
            }
        }
        return twiceAndMissing;
    }
}
