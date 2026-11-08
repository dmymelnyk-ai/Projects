package homework.h08;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class T2Test {

  @Test
  void example1() {
    List<Integer> nums = new ArrayList<>(List.of(-1, 1, 2, 3, 1));

    assertThat(new T2().countPairs(nums, 2)).isEqualTo(3);
  }

  @Test
  void example2() {
    List<Integer> nums = new ArrayList<>(List.of(-6, 2, 5, -2, -7, -1, 3));

    assertThat(new T2().countPairs(nums, -2)).isEqualTo(10);
  }

  @Test
  void returnsOneForMinimumListSize() {
    List<Integer> nums = new ArrayList<>(List.of(-50, 50));

    assertThat(new T2().countPairs(nums, 1)).isEqualTo(1);
  }

  @Test
  void returnsZeroWhenPairSumEqualsTarget() {
    List<Integer> nums = new ArrayList<>(List.of(1, 1));

    assertThat(new T2().countPairs(nums, 2)).isEqualTo(0);
  }

  @Test
  void returnsZeroForMinimumTarget() {
    List<Integer> nums = new ArrayList<>(List.of(-50, -50));

    assertThat(new T2().countPairs(nums, -100)).isEqualTo(0);
  }

  @Test
  void handlesMaximumListSize() {
    List<Integer> nums = new ArrayList<>();

    for (int i = 0; i < 50; i++) {
      nums.add(-50);
    }

    assertThat(new T2().countPairs(nums, 100)).isEqualTo(1225);
  }
}
