package info.vladyslav.EPAM_HW_5_1122;

import java.util.List;

/**
 * Task 3
 * Given a sorted array nums, remove the duplicates in-place such that each element
 * appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 */


public class T3RemoveDuplicates {
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    void removeDuplicats() {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == list.get(i - 1)) {
                list.remove(i);
            }
        }
    }
}
