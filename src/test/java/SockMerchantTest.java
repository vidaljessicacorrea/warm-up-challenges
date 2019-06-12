import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

    @Test
    public void sockMerchant1() {
        int[] ar_2 = {10,20,20,10,10,30,50,10,20};
        int n_2 = ar_2.length;
        int result_2 = SockMerchant.sockMerchant(n_2, ar_2);
        Assert.assertEquals(3,result_2);
    }
}