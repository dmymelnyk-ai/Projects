package homework.h01;

// smallestEvenMultiple
// https://leetcode.com/problems/smallest-even-multiple/
public class T2 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }
}
