package info.vladyslav.EPAM_HW_06_1202;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Task 2
 * Given an array of integers and an integer k, find out whether there are
 * two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 */

public class T2SifferenceAtMostKorNot {

    boolean containsNearbyDuplicate(LinkedList<Integer> linkedList, int k) {
        HashMap<Integer, Integer> hashMapForCompare = new HashMap<>();

        for (int i = 0; i < linkedList.size(); i++) {
            if (hashMapForCompare.containsKey(linkedList.get(i))) {
                int duplicateKeyInitialIndex = hashMapForCompare.get(linkedList.get(i));
                System.out.println(hashMapForCompare.get(linkedList.get(i)));
                if (i - duplicateKeyInitialIndex <= k)
                    return true;
            }
            hashMapForCompare.put(linkedList.get(i), i);
        }
        return false;
    }
}
