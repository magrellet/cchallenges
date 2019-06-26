package leetc;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void reverseIntTest(){
        ReverseInteger rev = new ReverseInteger();
        Assert.assertEquals(321, rev.reverse(123));
        Assert.assertEquals(21, rev.reverse(120));
        Assert.assertEquals(-321, rev.reverse(-123));

    }
}
