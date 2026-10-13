package homework.h03;

// Average Salary Excluding the Minimum and Maximum Salary
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

public class T1 {
    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];

        for (int s : salary) {
            sum += s;

            if (s < min) {
                min = s;
            }

            if (s > max) {
                max = s;
            }
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}
