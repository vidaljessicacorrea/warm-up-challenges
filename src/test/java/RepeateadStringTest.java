import org.junit.Assert;
import org.junit.Test;

public class RepeateadStringTest {

    @Test
    public void test1(){

        Assert.assertEquals(7,RepeatedString.repeatedString("aba",10));
    }

    @Test
    public void test2(){

        Assert.assertEquals(1000000000000L,RepeatedString.repeatedString("a",1000000000000l));
    }

    @Test
    public void test3(){

        Assert.assertEquals(164280,RepeatedString.repeatedString("gfcaaaecbg",547602));
    }

}
