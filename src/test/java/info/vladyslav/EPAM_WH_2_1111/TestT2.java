package info.vladyslav.EPAM_WH_2_1111;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestT2 {
    private T2RemoveValueInstancesInArray t2test = new T2RemoveValueInstancesInArray();

    @Test
    public void setT2RemoveValueInstancesInArray(){
        assertEquals(t2test.run(new int[]{3,2,2,3}, 3),2);
        assertEquals(t2test.run(new int[]{0,1,2,2,3,0,4,2}, 2),5);
    }

}
