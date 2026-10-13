package homework.h01;

// countOdds
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class T1 {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
