import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnCloudsTest1(){
        int[] ar_1 = {0,0,1,0,0,1,0};

        int result = JumpingOnTheClouds.jumpingOnClouds(ar_1);

        assertEquals(4,result);
    }

    @Test
    public void jumpingOnCloudsTest2(){
        int[] ar_2 = {0,0,0,0,1,0};

        int result = JumpingOnTheClouds.jumpingOnClouds(ar_2);

        assertEquals(3,result);
    }

    @Test
    public void jumpingOnCloudsTest3(){
        int[] ar_3 = {0,1,0,0,0,1,0};

        int result = JumpingOnTheClouds.jumpingOnClouds(ar_3);

        assertEquals(3,result);
    }


}
