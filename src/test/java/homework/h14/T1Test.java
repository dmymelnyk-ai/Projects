package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().removeDuplicates("abbaca")).isEqualTo("ca");
  }

  @Test
  void example2() {
    assertThat(new T1().removeDuplicates("azxxzy")).isEqualTo("ay");
  }
}
