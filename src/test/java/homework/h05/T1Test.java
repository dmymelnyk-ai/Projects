package homework.h05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().maxProductDifference(new int[] {5, 6, 2, 7, 4})).isEqualTo(34);
  }

  @Test
  void example2() {
    assertThat(new T1().maxProductDifference(new int[] {4, 2, 5, 9, 7, 4, 8})).isEqualTo(64);
  }

  @Test
  void handlesFourElements() {
    assertThat(new T1().maxProductDifference(new int[] {1, 2, 3, 4})).isEqualTo(10);
  }
}
