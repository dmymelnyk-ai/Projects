package homework.h05;

// base
// https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Arrays;

public class T2 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}