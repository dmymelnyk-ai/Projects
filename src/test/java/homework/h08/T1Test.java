package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1})).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1, 0, 1, 1, 0, 1})).isEqualTo(2);
  }

  @Test
  void returnsZeroForArrayWithOnlyZeros() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {0, 0, 0})).isEqualTo(0);
  }

  @Test
  void returnsOneForSingleOne() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {1})).isEqualTo(1);
  }

  @Test
  void returnsZeroForSingleZero() {
    assertThat(new T1().findMaxConsecutiveOnes(new int[] {0})).isEqualTo(0);
  }

  @Test
  void handlesMaximumArrayLength() {
    int[] nums = new int[100000];
    Arrays.fill(nums, 1);

    assertThat(new T1().findMaxConsecutiveOnes(nums)).isEqualTo(100000);
  }
}
