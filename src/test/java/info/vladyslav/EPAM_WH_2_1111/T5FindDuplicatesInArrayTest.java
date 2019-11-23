package info.vladyslav.EPAM_WH_2_1111;

import org.junit.Test;

import static org.junit.Assert.*;

public class T5FindDuplicatesInArrayTest {
    private T5FindDuplicatesInArray testT5 = new T5FindDuplicatesInArray();

    @Test
    public void setTestT5n1(){
        assertTrue( testT5.run(new int[]{1,2,3,1}) );
    }

    @Test
    public void setTestT5n2(){
        assertFalse(testT5.run(new int[]{1,2,3,4}));
    }

    @Test
    public void setTestTn3(){
        assertTrue( testT5.run(new int[]{1,1,1,3,3,4,3,2,4,2}) );
    }

}
