package homework.h05;

// base
// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

import java.util.Arrays;

public class T1 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int max = nums[n - 1] * nums[n - 2];
        int min = nums[0] * nums[1];

        return max - min;
    }
}