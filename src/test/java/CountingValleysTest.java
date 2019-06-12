import org.junit.Assert;
import org.junit.Test;


public class CountingValleysTest {

    @Test
    public void test1() {

        String ar_1 = "UDDDUDUU";
        int n_1 = ar_1.length();

        int result = CountingValleys.countingValleys(n_1, ar_1);

        Assert.assertEquals(1,result);
    }

    @Test
    public void test2() {

        String ar_2 = "DDUUDDUDUUUD";
        int n_2 = ar_2.length();

        int result = CountingValleys.countingValleys(n_2, ar_2);

        Assert.assertEquals(2,result);
    }

}