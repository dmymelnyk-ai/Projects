package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().average(new int[] {4000, 3000, 1000, 2000}))
        .isCloseTo(2500.0, within(1e-5));
  }

  @Test
  void example2() {
    assertThat(new T1().average(new int[] {1000, 2000, 3000})).isCloseTo(2000.0, within(1e-5));
  }

  @Test
  void handlesNonIntegerAverage() {
    assertThat(new T1().average(new int[] {1000, 2000, 5000, 9000}))
        .isCloseTo(3500.0, within(1e-5));
  }
}
