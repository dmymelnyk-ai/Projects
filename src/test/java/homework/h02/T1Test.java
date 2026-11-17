package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().addDigits(38)).isEqualTo(2);
  }

  @Test
  void example2() {
    assertThat(new T1().addDigits(0)).isEqualTo(0);
  }

  @Test
  void handlesSingleDigit() {
    assertThat(new T1().addDigits(9)).isEqualTo(9);
  }

  @Test
  void handlesMultipleIterations() {
    assertThat(new T1().addDigits(9999)).isEqualTo(9);
  }
}
