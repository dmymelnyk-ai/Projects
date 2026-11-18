package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    T2 queue = new T2();
    queue.push(1);
    queue.push(2);
    assertThat(queue.peek()).isEqualTo(1);
    assertThat(queue.pop()).isEqualTo(1);
    assertThat(queue.empty()).isFalse();
  }
}
