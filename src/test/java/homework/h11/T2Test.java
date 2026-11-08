package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().majorityElement(new int[] {3, 2, 3})).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(new T2().majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
  }

  @Test
  void handlesSingleElement() {
    assertThat(new T2().majorityElement(new int[] {5})).isEqualTo(5);
  }

  @Test
  void handlesAllEqualElements() {
    assertThat(new T2().majorityElement(new int[] {4, 4, 4, 4})).isEqualTo(4);
  }

  @Test
  void handlesMajorityAtTheEnd() {
    assertThat(new T2().majorityElement(new int[] {1, 2, 2, 2, 2})).isEqualTo(2);
  }
}
