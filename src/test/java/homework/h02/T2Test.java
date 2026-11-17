package homework.h02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().isSameAfterReversals(526)).isTrue();
  }

  @Test
  void example2() {
    assertThat(new T2().isSameAfterReversals(1800)).isFalse();
  }

  @Test
  void example3() {
    assertThat(new T2().isSameAfterReversals(0)).isTrue();
  }

  @Test
  void handlesSingleTrailingZero() {
    assertThat(new T2().isSameAfterReversals(10)).isFalse();
  }
}
