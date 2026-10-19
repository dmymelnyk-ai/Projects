package homework.h04;

// base
// https://leetcode.com/problems/hamming-distance/
public class T1 {
    public int hammingDistance(int x, int y) {
        int count = 0;

        while (x > 0 || y > 0) {
            if (x % 2 != y % 2) {
                count++;
            }

            x = x / 2;
            y = y / 2;
        }

        return count;
    }
}
