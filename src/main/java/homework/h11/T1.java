package homework.h11;

// https://leetcode.com/problems/missing-number/

public class T1 {
  public int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int num : nums) {
      actualSum += num;
    }

    return sum - actualSum;
  }
}
