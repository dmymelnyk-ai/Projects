package homework.h06;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().isAnagram("anagram", "nagaram")).isTrue();
  }

  @Test
  void example2() {
    assertThat(new T1().isAnagram("rat", "car")).isFalse();
  }

  @Test
  void handlesDifferentLengths() {
    assertThat(new T1().isAnagram("ab", "a")).isFalse();
  }

  @Test
  void handlesEmptyStrings() {
    assertThat(new T1().isAnagram("", "")).isTrue();
  }
}
