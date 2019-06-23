package leetc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSum {

    @Test
    public void TwoSumTests() {
        leetc.TwoSum sum = new leetc.TwoSum();
        int[] nums = new int[]{2,5,5,11};
        int target = 10;
        int[] result = sum.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }
}
