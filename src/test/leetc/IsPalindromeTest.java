package leetc;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindromeTest {

    @Test
    public void isPalindromeTest(){
        IsPalindrome isPalindrome = new IsPalindrome();
        String v = "sasas";
        v.substring(0,1);

        Assert.assertTrue(isPalindrome.isPalindrome(121));
        Assert.assertFalse(isPalindrome.isPalindrome(-121));
        Assert.assertFalse(isPalindrome.isPalindrome(10));
    }
}
