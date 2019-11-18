package info.vladyslav.EPAM_WH_2_1111;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestT5 {
    private T5FindDuplicatesInArray testT5 = new T5FindDuplicatesInArray();

    @Test
    public void setTestT5(){
        assertTrue( testT5.run(new int[]{1,2,3,1}) );
        assertFalse(testT5.run(new int[]{1,2,3,4}));
        assertTrue( testT5.run(new int[]{1,1,1,3,3,4,3,2,4,2}) );

    }

}
