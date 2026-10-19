package homework.h04;

// advanced
// https://leetcode.com/problems/number-complement/
public class T2 {
    public int findComplement(int num) {
        int result = 0;
        int place = 1;

        while (num > 0) {
            if (num % 2 == 0) {
                result += place;
            }

            num = num / 2;
            place = place * 2;
        }

        return result;
    }
}
