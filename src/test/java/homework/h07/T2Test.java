package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().numberOfSteps(14)).isEqualTo(6);
  }

  @Test
  void example2() {
    assertThat(new T2().numberOfSteps(8)).isEqualTo(4);
  }

  @Test
  void example3() {
    assertThat(new T2().numberOfSteps(123)).isEqualTo(12);
  }

  @Test
  void handlesZero() {
    assertThat(new T2().numberOfSteps(0)).isEqualTo(0);
  }
}
