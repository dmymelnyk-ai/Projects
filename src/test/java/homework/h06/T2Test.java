package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    assertThat(new T2().isPalindrome("A man, a plan, a canal: Panama")).isTrue();
  }

  @Test
  void example2() {
    assertThat(new T2().isPalindrome("race a car")).isFalse();
  }

  @Test
  void example3() {
    assertThat(new T2().isPalindrome(" ")).isTrue();
  }

  @Test
  void handlesDigits() {
    assertThat(new T2().isPalindrome("1a2")).isFalse();
    assertThat(new T2().isPalindrome("1a1")).isTrue();
  }
}
