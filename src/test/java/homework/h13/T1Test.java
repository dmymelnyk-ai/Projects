package homework.h13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1(4).firstBadVersion(5)).isEqualTo(4);
  }

  @Test
  void example2() {
    assertThat(new T1(1).firstBadVersion(1)).isEqualTo(1);
  }

  @Test
  void handlesBadVersionAtEnd() {
    assertThat(new T1(10).firstBadVersion(10)).isEqualTo(10);
  }
}
