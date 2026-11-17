package homework.h07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T1Test {

  @Test
  void example1() {
    assertThat(new T1().fizzBuzz(3)).containsExactly("1", "2", "Fizz");
  }

  @Test
  void example2() {
    assertThat(new T1().fizzBuzz(5)).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void example3() {
    assertThat(new T1().fizzBuzz(15))
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }
}
