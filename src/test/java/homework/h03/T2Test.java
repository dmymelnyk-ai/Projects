package homework.h03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().differenceOfSums(10, 3)).isEqualTo(19);
  }

  @Test
  void example2() {
    assertThat(new T2().differenceOfSums(5, 6)).isEqualTo(15);
  }

  @Test
  void example3() {
    assertThat(new T2().differenceOfSums(5, 1)).isEqualTo(-15);
  }

  @Test
  void handlesSingleElement() {
    assertThat(new T2().differenceOfSums(1, 1)).isEqualTo(-1);
  }
}
