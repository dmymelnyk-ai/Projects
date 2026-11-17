package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().findComplement(5)).isEqualTo(2);
  }

  @Test
  void example2() {
    assertThat(new T2().findComplement(1)).isEqualTo(0);
  }

  @Test
  void handlesPowerOfTwoMinusOne() {
    assertThat(new T2().findComplement(7)).isEqualTo(0);
  }

  @Test
  void handlesPowerOfTwo() {
    assertThat(new T2().findComplement(8)).isEqualTo(7);
  }
}
