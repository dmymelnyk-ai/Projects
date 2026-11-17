package homework.h12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().heightChecker(new int[] {1, 1, 4, 2, 1, 3})).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(new T1().heightChecker(new int[] {5, 1, 2, 3, 4})).isEqualTo(5);
  }

  @Test
  void example3() {
    assertThat(new T1().heightChecker(new int[] {1, 2, 3, 4, 5})).isEqualTo(0);
  }
}
