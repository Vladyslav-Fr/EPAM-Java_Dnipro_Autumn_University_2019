package info.vladyslav.EPAM_WH_2_1111;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class T2RemoveValueInstancesInArrayTest {
    private T2RemoveValueInstancesInArray t2test = new T2RemoveValueInstancesInArray();

    @Test
    public void setT2RemoveValueInstancesInArrayN1(){
        assertEquals(t2test.run(new int[]{3,2,2,3}, 3),2);
    }
    @Test
    public void setT2RemoveValueInstancesInArrayN2(){
        assertEquals(t2test.run(new int[]{0,1,2,2,3,0,4,2}, 2),5);
    }
}
