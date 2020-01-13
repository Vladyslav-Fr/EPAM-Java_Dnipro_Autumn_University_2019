package info.vladyslav.EPAM_HW_06_1202;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Task 3
 * Given an integer array with even length, where different numbers in this array represent
 * different kinds of candies. Each number means one candy of the corresponding kind.
 * You need to distribute these candies equally in number to brother and sister.
 * Return the maximum number of kinds of candies the sister could gain.
 */

public class T3AmountKindsOfCandies {

    int maxAmountOfKindOfCandies(ArrayList<Integer> candies) {
        HashSet<Integer> differentCandies = new HashSet<>();
        differentCandies.addAll(candies);
        return Math.min(differentCandies.size(), candies.size() / 2);
    }
}
