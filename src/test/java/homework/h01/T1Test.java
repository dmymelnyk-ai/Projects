package homework.h01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().countOdds(3, 7)).isEqualTo(3);
  }

  @Test
  void example2() {
    assertThat(new T1().countOdds(8, 10)).isEqualTo(1);
  }

  @Test
  void handlesSingleOddNumber() {
    assertThat(new T1().countOdds(5, 5)).isEqualTo(1);
  }

  @Test
  void handlesSingleEvenNumber() {
    assertThat(new T1().countOdds(4, 4)).isEqualTo(0);
  }

  @Test
  void handlesZeroStart() {
    assertThat(new T1().countOdds(0, 10)).isEqualTo(5);
  }
}
