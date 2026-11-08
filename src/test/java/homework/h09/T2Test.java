package homework.h09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3))
        .containsExactly(true, true, true, false, true);
  }

  @Test
  void example2() {
    assertThat(new T2().kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1))
        .containsExactly(true, false, false, false, false);
  }

  @Test
  void example3() {
    assertThat(new T2().kidsWithCandies(new int[] {12, 1, 12}, 10))
        .containsExactly(true, false, true);
  }

  @Test
  void handlesSingleChild() {
    assertThat(new T2().kidsWithCandies(new int[] {5}, 0)).containsExactly(true);
  }

  @Test
  void handlesZeroExtraCandies() {
    assertThat(new T2().kidsWithCandies(new int[] {1, 2, 3}, 0))
        .containsExactly(false, false, true);
  }

  @Test
  void returnsTrueWhenAllChildrenHaveTheSameCandies() {
    assertThat(new T2().kidsWithCandies(new int[] {2, 2, 2}, 0)).containsExactly(true, true, true);
  }
}
