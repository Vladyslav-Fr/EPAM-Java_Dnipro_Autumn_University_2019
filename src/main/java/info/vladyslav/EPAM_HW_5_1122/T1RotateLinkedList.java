package info.vladyslav.EPAM_HW_5_1122;

import java.util.LinkedList;
import java.util.List;

/**
 * Task 1
 * Given a linked list, rotate the list to the right by k places, where k is non-negative
 */

public class T1RotateLinkedList {
    private List<Integer> rotor;

    public List<Integer> getRotor() {
        return rotor;
    }

    public void setRotor(List<Integer> rotor) {
        this.rotor = rotor;
    }

    public T1RotateLinkedList(LinkedList<Integer> rotor) {
        rotor.add(1);
        rotor.add(2);
        rotor.add(3);
        rotor.add(4);
        rotor.add(5);
        this.rotor = rotor;
    }

    void shiftRight(int k) {
        for (int j = 0; j < k; j++) {
            Integer temp = rotor.get(rotor.size() - 1);
            for (int i = rotor.size() - 1; i >= 0; i--) {
                if (i == 0) {
                    rotor.set(i, temp);
                } else {
                    rotor.set(i, rotor.get(i - 1));
                }
            }
        }
    }
}

