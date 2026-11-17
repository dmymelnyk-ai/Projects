package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().smallestEvenMultiple(5)).isEqualTo(10);
  }

  @Test
  void example2() {
    assertThat(new T2().smallestEvenMultiple(6)).isEqualTo(6);
  }

  @Test
  void handlesOne() {
    assertThat(new T2().smallestEvenMultiple(1)).isEqualTo(2);
  }

  @Test
  void handlesTwo() {
    assertThat(new T2().smallestEvenMultiple(2)).isEqualTo(2);
  }
}
