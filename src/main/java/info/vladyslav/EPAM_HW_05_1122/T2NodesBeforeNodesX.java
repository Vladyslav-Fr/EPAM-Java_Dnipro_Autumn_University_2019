package info.vladyslav.EPAM_HW_05_1122;

import java.util.LinkedList;
import java.util.List;

/**
 * Task 2
 * Given a linked list and a value x, partition it such that all nodes less than x
 * come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 */

public class T2NodesBeforeNodesX {
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    void transfertBeforeX(Integer x) {
        LinkedList<Integer> lessThanX = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < x) {
                lessThanX.add(list.get(i));
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (lessThanX.size() > 0) {
                if (list.get(i) > lessThanX.get(i)) {
                    while (lessThanX.size() != 0) {
                        int index = 0;
                        list.add(i, lessThanX.get(index));
                        lessThanX.remove(index);
                    }
                }
            }
        }
    }
}

