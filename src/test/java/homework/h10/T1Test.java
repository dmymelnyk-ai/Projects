package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().kthCharacter(5)).isEqualTo('b');
  }

  @Test
  void example2() {
    assertThat(new T1().kthCharacter(10)).isEqualTo('c');
  }

  @Test
  void returnsAForFirstPosition() {
    assertThat(new T1().kthCharacter(1)).isEqualTo('a');
  }

  @Test
  void returnsBForThirdPosition() {
    assertThat(new T1().kthCharacter(3)).isEqualTo('b');
  }

  @Test
  void returnsCForFourthPosition() {
    assertThat(new T1().kthCharacter(4)).isEqualTo('c');
  }
}
