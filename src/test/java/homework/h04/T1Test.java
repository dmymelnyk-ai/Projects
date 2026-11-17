package homework.h04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().hammingDistance(1, 4)).isEqualTo(2);
  }

  @Test
  void example2() {
    assertThat(new T1().hammingDistance(3, 1)).isEqualTo(1);
  }

  @Test
  void handlesEqualNumbers() {
    assertThat(new T1().hammingDistance(7, 7)).isEqualTo(0);
  }

  @Test
  void handlesZero() {
    assertThat(new T1().hammingDistance(0, 15)).isEqualTo(4);
  }
}
