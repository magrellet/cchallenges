package leetc;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] returnArr = new int[2];
        boolean isTarget = false;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    returnArr[0] = i;
                    returnArr[1] = j;
                    isTarget = true;
                    break;
                }
            }
            if (isTarget) {
                break;
            }
        }
        return returnArr;
    }
}
