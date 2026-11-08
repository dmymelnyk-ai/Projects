package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 2, 3, 1, 1, 3})).isEqualTo(4);
  }

  @Test
  void example2() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 1, 1, 1})).isEqualTo(6);
  }

  @Test
  void example3() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 2, 3})).isEqualTo(0);
  }

  @Test
  void returnsZeroForSingleElement() {
    assertThat(new T1().numIdenticalPairs(new int[] {1})).isEqualTo(0);
  }

  @Test
  void countsPairsWithDifferentRepeatedNumbers() {
    assertThat(new T1().numIdenticalPairs(new int[] {1, 2, 1, 2})).isEqualTo(2);
  }
}
