package leetc;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void longestPrefixTest(){
        LongestCommonPrefix longest = new LongestCommonPrefix();
        String[] test1 = new String[]{"flower","flow","flight"};
        String[] test2 = new String[]{"dog","racecar","car"};
        String[] test3 = new String[]{"a"};


        Assert.assertEquals("fl", longest.longestCommonPrefix(test1));
        Assert.assertEquals("",longest.longestCommonPrefix(test2));
        Assert.assertEquals("a", longest.longestCommonPrefix(test3));
    }
}
