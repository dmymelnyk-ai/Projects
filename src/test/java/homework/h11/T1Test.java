package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
  }

  @Test
  void example2() {
    assertThat(new T1().missingNumber(new int[] {0, 1})).isEqualTo(2);
  }

  @Test
  void example3() {
    assertThat(new T1().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
  }

  @Test
  void missingFirstNumber() {
    assertThat(new T1().missingNumber(new int[] {1, 2})).isEqualTo(0);
  }

  @Test
  void missingLastNumber() {
    assertThat(new T1().missingNumber(new int[] {0, 1, 2})).isEqualTo(3);
  }

  @Test
  void handlesSingleElement() {
    assertThat(new T1().missingNumber(new int[] {0})).isEqualTo(1);
  }
}
