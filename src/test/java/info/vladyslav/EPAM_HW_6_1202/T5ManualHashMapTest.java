package info.vladyslav.EPAM_HW_6_1202;

import org.junit.Test;

import static org.junit.Assert.*;

public class T5ManualHashMapTest {
    T5ManualHashMap t5ManualHashMap = new T5ManualHashMap();
    @Test
    public void t5ManualHashMapTest1() {
        t5ManualHashMap.put(1, 1);
        t5ManualHashMap.put(2, 2);
        assertEquals(t5ManualHashMap.get(1), 1);
    }

    @Test
    public void t5ManualHashMapTest2() {
        t5ManualHashMap.put(1, 1);
        t5ManualHashMap.put(2, 2);
        assertEquals(t5ManualHashMap.get(3),-1);
    }

    @Test
    public void t5ManualHashMapTest3() {
        t5ManualHashMap.put(1, 1);
        t5ManualHashMap.put(2, 2);
        t5ManualHashMap.put(2, 1);
        assertEquals(t5ManualHashMap.get(2),1);
    }

    @Test
    public void t5ManualHashMapTest4() {
        t5ManualHashMap.put(1, 1);
        t5ManualHashMap.put(2, 2);
        t5ManualHashMap.put(2, 1);
        t5ManualHashMap.remove(2);
        assertEquals(t5ManualHashMap.get(2),-1);
    }
}