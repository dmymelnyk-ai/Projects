package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().sortedSquares(new int[] {-4, -1, 0, 3, 10}))
        .containsExactly(0, 1, 9, 16, 100);
  }

  @Test
  void example2() {
    assertThat(new T2().sortedSquares(new int[] {-7, -3, 2, 3, 11}))
        .containsExactly(4, 9, 9, 49, 121);
  }

  @Test
  void handlesAllNegative() {
    assertThat(new T2().sortedSquares(new int[] {-5, -3, -1})).containsExactly(1, 9, 25);
  }
}
