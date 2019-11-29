package info.vladyslav.EPAM_HW_5_1122;

import java.util.LinkedList;
import java.util.List;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x
 * come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 */

public class T2NodesBeforeNodesX {
    private List<Integer> transfer;

    public List<Integer> getTransfer() {
        return transfer;
    }

    public void setTransfer(List<Integer> transfer) {
        this.transfer = transfer;
    }

    void transfertBefore(Integer x) {
        LinkedList<Integer> temp = new LinkedList<Integer>();
        for (int i = transfer.size() - 1; i >= 0; i--) {
            if (transfer.get(i) < x) {
                temp.add(transfer.get(i));
                transfer.remove(i);
            }
        }

        for (int i = 0; i < transfer.size() - 1; i++) {
            if (temp.size() > 0) {
                if (transfer.get(i) > temp.get(i)) {
                    while (temp.size() != 0) {
                        int index = 0;
                        transfer.add(i, temp.get(index));
                        temp.remove(index);
                    }
                }
            }
        }
    }
}

