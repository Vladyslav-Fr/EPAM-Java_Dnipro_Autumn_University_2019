package info.vladyslav.EPAM_HW_5_1122;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;


public class T2NodesBeforeNodesXTest {

    @Before
    public void before() {
    }

    @Test
    public void transferBefore3() {
        T2NodesBeforeNodesX t2NodesBeforeNodesX = new T2NodesBeforeNodesX();
        t2NodesBeforeNodesX.setList(new LinkedList<Integer>());

        t2NodesBeforeNodesX.getList().add(1);
        t2NodesBeforeNodesX.getList().add(4);
        t2NodesBeforeNodesX.getList().add(3);
        t2NodesBeforeNodesX.getList().add(2);
        t2NodesBeforeNodesX.getList().add(5);
        t2NodesBeforeNodesX.getList().add(2);
        t2NodesBeforeNodesX.transfertBeforeX(3);

        LinkedList test = new LinkedList();
        test.add(1);
        test.add(2);
        test.add(2);
        test.add(4);
        test.add(3);
        test.add(5);

        assertEquals(t2NodesBeforeNodesX.getList(), test);
    }

    @Test
    public void transferBefore4() {
        T2NodesBeforeNodesX t2NodesBeforeNodesX = new T2NodesBeforeNodesX();
        t2NodesBeforeNodesX.setList(new LinkedList<Integer>());


        t2NodesBeforeNodesX.getList().add(1);
        t2NodesBeforeNodesX.getList().add(4);
        t2NodesBeforeNodesX.getList().add(3);
        t2NodesBeforeNodesX.getList().add(2);
        t2NodesBeforeNodesX.getList().add(5);
        t2NodesBeforeNodesX.getList().add(2);
        t2NodesBeforeNodesX.transfertBeforeX(4);

        LinkedList test = new LinkedList();
        test.add(1);
        test.add(3);
        test.add(2);
        test.add(2);
        test.add(4);
        test.add(5);

        assertEquals(t2NodesBeforeNodesX.getList(), test);
    }


}