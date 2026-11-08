package homework.h10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    char[] chars = {'h', 'e', 'l', 'l', 'o'};

    new T2().reverseString(chars);

    assertThat(chars).containsExactly('o', 'l', 'l', 'e', 'h');
  }

  @Test
  void example2() {
    char[] chars = {'H', 'a', 'n', 'n', 'a', 'h'};

    new T2().reverseString(chars);

    assertThat(chars).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
  }

  @Test
  void handlesEmptyArray() {
    char[] chars = {};

    new T2().reverseString(chars);

    assertThat(chars).isEmpty();
  }

  @Test
  void handlesSingleCharacter() {
    char[] chars = {'a'};

    new T2().reverseString(chars);

    assertThat(chars).containsExactly('a');
  }

  @Test
  void handlesTwoCharacters() {
    char[] chars = {'a', 'b'};

    new T2().reverseString(chars);

    assertThat(chars).containsExactly('b', 'a');
  }
}
